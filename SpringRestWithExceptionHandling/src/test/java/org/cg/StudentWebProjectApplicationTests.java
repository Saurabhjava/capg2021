package org.cg;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.cg.service.StudentService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class StudentWebProjectApplicationTests {
	@Autowired
	StudentService stuService;
	@Test
	void contextLoads() {
		assertNotNull(stuService.getStudentByID(104));
	}

}
