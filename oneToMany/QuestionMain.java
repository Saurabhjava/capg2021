package oneToMany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class QuestionMain {

	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("day3");
		EntityManager em=factory.createEntityManager();
		EntityTransaction tx=em.getTransaction();
		tx.begin();
		
		Question q=new Question("What is Java?", "Low");
		
		List<Answer> li=new ArrayList<Answer>();
		li.add(new Answer("Java ia OOP.",q));
		li.add(new Answer("Java is Simple",q));
		li.add(new Answer("Java is Multithreaded",q));
		
		q.setAnswer(li);
		
		em.persist(q);
		tx.commit();
		System.out.println("=============Done==============");

	}

}
