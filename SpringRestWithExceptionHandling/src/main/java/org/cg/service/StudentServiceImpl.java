package org.cg.service;

import java.util.List;
import java.util.Optional;

import org.cg.dao.StudentDao;
import org.cg.dao.StudentRepository;
import org.cg.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	StudentRepository sDao;

	@Override
	public List<Student> getAllStudent() {
		
		return sDao.findAll();
	}

	@Override
	public List<Student> createStudent(Student stu) {
		sDao.saveAndFlush(stu);
		return sDao.findAll();
	}

	@Override
	public List<Student> getStudentByName(String name) {
		return sDao.getStudentByName(name);
	}

	@Override
	public Student getStudentByID(int studentid) {
		Optional<Student> op=sDao.findById(studentid);
		if(op.isPresent())
			return op.get();
		else
			return null;
	}

}
