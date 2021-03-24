package org.cg.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.cg.model.Student;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class StudentDaoImpl implements StudentDao{
	
	@PersistenceContext
	EntityManager em;
	
	/*@Override
	public List<Student> createStudent(Student stu) {
		em.persist(stu);
		return getAllStudent();
	}

	@Override
	public List<Student> getAllStudent() {
		TypedQuery<Student> q=em.createQuery("select s from Student s",Student.class);
		return q.getResultList();
	}*/

	@Override
	public List<Student> getStudentByName(String name) {
		
		TypedQuery<Student> q=em.createQuery("select s from Student s where s.name like :n",Student.class);
		q.setParameter("n", name+"%");
		return q.getResultList();
	}

}
