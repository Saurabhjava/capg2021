package com;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class EmployeeMain {

	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("day3");
		EntityManager em=factory.createEntityManager();
		EntityTransaction tx=em.getTransaction();
		tx.begin();
		Address obj=new Address(102, "Bangalore", "India", 110070);
		Employee emp=new Employee(112, "Saurabh", "Java", 26000, obj);
		//em.persist(obj);
		em.persist(emp);
		System.out.println("Employee Created.....");
		tx.commit();
		tx.begin();
		/*Employee emp=em.find(Employee.class, 111);
		
		System.out.println("============Employee Details=============");
		System.out.println(emp.getName()+"\t"+emp.getSalary()+"\t"+emp.getDept());
		System.out.println("============Address Details=============");
		System.out.println(emp.getAddress().getAddressId()+"\t"+emp.getAddress().getCity()+"\t"+emp.getAddress().getCountry());
		em.remove(emp);
		tx.commit();
		System.out.println("Employee Deleted...");*/
	}

}
