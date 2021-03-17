package org.cg.controller;

import java.util.List;

import org.cg.exception.StudentNotFoundException;
import org.cg.model.Student;
import org.cg.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("student")
public class StudentController {
	@Autowired
	StudentService sService;
	@GetMapping
	public List<Student> printAllStudent() {
		return sService.getAllStudent();
	}
	@PostMapping
	public List<Student> saveStudent(@RequestBody Student obj) {
		return sService.createStudent(obj);
	}
	@GetMapping("/name/{name}")
	public List<Student> printAllStudentByName(@PathVariable String name) {
		return sService.getStudentByName(name);
	}
	@GetMapping("/{sid}")
	public Student findStudent(@PathVariable int sid) throws StudentNotFoundException{
		Student s=null;
		try {
			s=sService.getStudentByID(sid);
		}
		catch(Exception e) {
			throw new StudentNotFoundException("Student with given id is not available!");
		}
		return s;
	}
}







