package inheritanceMapping;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class EmpMain {

	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("day3");
		EntityManager em=factory.createEntityManager();
		EntityTransaction tx=em.getTransaction();
		tx.begin();
		ContractEmployee emp=new ContractEmployee();
		//PermanentEmployee emp=new PermanentEmployee();
		emp.setName("Saurabh");
		emp.setDoj(new Date());
		//emp.setSalary(34000);
		emp.setPayPerHour(4000);
		em.persist(emp);
		tx.commit();
		System.out.println("================Done================");

	}

}
