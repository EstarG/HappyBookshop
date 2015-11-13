package com.chinasofti.etc.happybookshop.dao;

import com.chinasofti.etc.happybookshop.po.Employee;

public interface EmployeeDao {
	// ����Ա��
	Employee findEmployeeById(int employeeId);
	Employee findEmployeeByName(String employeeName);
	// ������Ա��
	int insertEmployee(Employee employee);
	// ɾ��Ա��
	int deleteEmployeeById(int employeeId);
	int deleteEmployeeByName(String employeeName);
	// ����Ա����Ϣ
	int updateEmployeeById(int employeeId, Employee newEmployee);
	int updateEmployeeByName(String employeeName, Employee newEmployee);
}
