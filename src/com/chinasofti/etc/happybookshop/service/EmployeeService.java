package com.chinasofti.etc.happybookshop.service;

import com.chinasofti.etc.happybookshop.po.Employee;

public interface EmployeeService {
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
