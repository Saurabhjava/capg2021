package com.capg.pl;

import java.util.Date;

import com.capg.pojo.Employee;
import com.capg.service.EmployeeService;
import com.capg.service.EmployeeServiceImpl;

public class EmployeeMain {

	public static void main(String[] args) {
		EmployeeService es=new EmployeeServiceImpl();
		Employee e=new Employee("Saurabh", 35000, new Date());
		String result=es.createEmployee(e);
		System.out.println("======================");
		System.out.println(result);
		System.out.println("======================");
		

	}

}
