package org.cg.service;

import java.util.List;

import org.cg.model.Student;

public interface StudentService {
	public List<Student> getAllStudent();
	public List<Student> createStudent(Student stu);
	public List<Student> getStudentByName(String name);
	public Student getStudentByID(int studentid);
}
