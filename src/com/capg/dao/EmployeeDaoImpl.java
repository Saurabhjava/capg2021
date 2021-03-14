package com.capg.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.capg.config.JPAConfig;
import com.capg.pojo.Employee;

public class EmployeeDaoImpl implements EmployeeDao{
	EntityManager eManager=JPAConfig.getEntityManager();
	
	@Override
	public String saveEmployee(Employee emp) {
		EntityTransaction tx=eManager.getTransaction();
		tx.begin();
		eManager.persist(emp);
		tx.commit();
		return "Employee Created.... Your ID is "+emp.getEmpid();
	}
}
