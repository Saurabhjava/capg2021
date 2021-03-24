package org.cg;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.cg.model.Address;
import org.cg.model.Student;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@SpringBootTest
class StudentWebProjectApplicationTests extends AbstractTest {
	/*
	 * @Autowired StudentService stuService;
	 * 
	 * @Test void contextLoads() { assertNotNull(stuService.getStudentByID(104)); }
	 */

	@Override
	@BeforeEach
	public void setUp() {
		super.setUp();
	}

	@Test
	public void getStudent() throws Exception {
		String uri = "/student/103";
		MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.get(uri)).andReturn();
		int status = mvcResult.getResponse().getStatus();
		assertEquals(200, status);
		String content = mvcResult.getResponse().getContentAsString();
		Student stu = super.mapFromJson(content, Student.class);
		assertEquals("Saurabh Sharma", stu.getName());
	}

	@Test
	public void createStudent() throws Exception {
		String uri = "/student";
		Student s = new Student(111, "Hari Babu", 77, new Address(119, "Noida", "India"));
		
		String inputJson = super.mapToJson(s);
		System.out.println("======================="+inputJson+"======================");
		MvcResult mvcResult = mvc.perform(
				MockMvcRequestBuilders.post(uri).contentType(MediaType.APPLICATION_JSON_VALUE).content(inputJson))
				.andReturn();

		int status = mvcResult.getResponse().getStatus();
		assertEquals(200, status);
		String content = mvcResult.getResponse().getContentAsString();
		Student studentList[] = super.mapFromJson(content, Student[].class);
		assertEquals(111, studentList[studentList.length-1].getSid());
		
	}
}
