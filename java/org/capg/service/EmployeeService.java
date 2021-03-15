package org.capg.service;

import java.util.List;

import org.capg.bean.Employee;

public interface EmployeeService {
	public List<Employee> printAllEmployee();
	public Employee findEmployee(int empid) ;
	public List<Employee> createEmployee(Employee emp);
	public List<Employee> removeEmployee(int empid);
	public List<Employee> updateEmployee(Employee emp) ;

}
