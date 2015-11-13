package com.chinasofti.etc.happybookshop.dao.sqlserverimpl;

import java.sql.SQLException;

import com.chinasofti.etc.happybookshop.dao.EmployeeDao;
import com.chinasofti.etc.happybookshop.po.Employee;

public class EmployeeDaoImpl extends BaseDao implements EmployeeDao {

	public Employee findEmployeeById(int employeeId) {
		// TODO Auto-generated method stub
		// 按Id查找店员（Employee）
		Employee employee = null;
		getConn();
		String sql = "select * from Employees where employeeId=?";
		doQuery(sql, employeeId);
		try {
			if (rs.next()) {
				employee = new Employee();
				employee.setEmployeeId(rs.getInt(1));
				employee.setEmployeeName(rs.getString(2));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			closeAll();
		}
		return employee;
	}

	public Employee findEmployeeByName(String employeeName) {
		// TODO Auto-generated method stub
		// 按姓名查找店员（Employee）
		Employee employee = null;
		getConn();
		String sql = "select * from Employees where employeeName=?";
		doQuery(sql, employeeName);
		try {
			if (rs.next()) {
				employee = new Employee();
				employee.setEmployeeId(rs.getInt(1));
				employee.setEmployeeName(rs.getString(2));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			closeAll();
		}
		return employee;
	}

	public int insertEmployee(Employee employee) {
		// TODO Auto-generated method stub
		// 插入一个新的店员
		getConn();
		String sql = "insert into Employees values(?)";
		doOperate(sql, employee.getEmployeeName());
		closeAll();
		return result;
	}

	public int deleteEmployeeById(int employeeId) {
		// TODO Auto-generated method stub
		// 按Id删除一个店员
		getConn();
		String sql = "delete from Employees where employeeId=?";
		doOperate(sql, employeeId);
		closeAll();
		return result;
	}

	public int deleteEmployeeByName(String employeeName) {
		// TODO Auto-generated method stub
		// 按姓名删除一个店员
		getConn();
		String sql = "delete from Employees where employeeName=?";
		doOperate(sql, employeeName);
		closeAll();
		return result;
	}

	public int updateEmployeeById(int employeeId, Employee newEmployee) {
		// TODO Auto-generated method stub
		// 以员工Id为索引更新员工信息
		getConn();
		String sql = "update Employees set employeeName=? where employeeId=?";
		doOperate(sql, newEmployee.getEmployeeName(), employeeId);
		closeAll();
		return result;
	}

	public int updateEmployeeByName(String employeeName, Employee newEmployee) {
		// TODO Auto-generated method stub
		// 以员工姓名为索引更新员工信息
		getConn();
		String sql = "update Employees set employeeName=? where employeeName=?";
		doOperate(sql, newEmployee.getEmployeeName(), employeeName);
		closeAll();
		return result;
	}
}
