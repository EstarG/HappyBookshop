package com.chinasofti.etc.happybookshop.dao;

import com.chinasofti.etc.happybookshop.po.Employee;

public interface EmployeeDao {
	// 查找员工
	Employee findEmployeeById(int employeeId);
	Employee findEmployeeByName(String employeeName);
	// 增添新员工
	int insertEmployee(Employee employee);
	// 删除员工
	int deleteEmployeeById(int employeeId);
	int deleteEmployeeByName(String employeeName);
	// 更新员工信息
	int updateEmployeeById(int employeeId, Employee newEmployee);
	int updateEmployeeByName(String employeeName, Employee newEmployee);
}
