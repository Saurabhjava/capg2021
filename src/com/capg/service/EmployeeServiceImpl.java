package com.capg.service;

import com.capg.dao.EmployeeDao;
import com.capg.dao.EmployeeDaoImpl;
import com.capg.pojo.Employee;

public class EmployeeServiceImpl implements EmployeeService {
	
	EmployeeDao edao=new EmployeeDaoImpl();
	
	@Override
	public String createEmployee(Employee emp) {
		if(emp.getName().length()<4 || emp.getSalary()<20000)
			return "Invalid Employee Data";
		else
			return edao.saveEmployee(emp);
	}

}
