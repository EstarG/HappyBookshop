package com.chinasofti.etc.happybookshop.service.serviceimpl;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import com.chinasofti.etc.happybookshop.dao.EmployeeDao;
import com.chinasofti.etc.happybookshop.po.Employee;
import com.chinasofti.etc.happybookshop.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService {
	private EmployeeDao employeeDao;

	public EmployeeServiceImpl() {
		super();
		// TODO Auto-generated constructor stub
		File file = new File("f:/myconfig.properties");
		Properties properties = new Properties();
		try {
			properties.load(new FileInputStream(file));
			String employeeDaoString = properties.getProperty("EmployeeDao");
			employeeDao = (EmployeeDao) Class.forName(employeeDaoString).newInstance();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	public Employee findEmployeeById(int employeeId) {
		// TODO Auto-generated method stub
		return employeeDao.findEmployeeById(employeeId);
	}

	public Employee findEmployeeByName(String employeeName) {
		// TODO Auto-generated method stub
		return employeeDao.findEmployeeByName(employeeName);
	}

	public int insertEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeDao.insertEmployee(employee);
	}

	public int deleteEmployeeById(int employeeId) {
		// TODO Auto-generated method stub
		return employeeDao.deleteEmployeeById(employeeId);
	}

	public int deleteEmployeeByName(String employeeName) {
		// TODO Auto-generated method stub
		return employeeDao.deleteEmployeeByName(employeeName);
	}

	public int updateEmployeeById(int employeeId, Employee newEmployee) {
		// TODO Auto-generated method stub
		return employeeDao.updateEmployeeById(employeeId, newEmployee);
	}

	public int updateEmployeeByName(String employeeName, Employee newEmployee) {
		// TODO Auto-generated method stub
		return employeeDao.updateEmployeeByName(employeeName, newEmployee);
	}

}
