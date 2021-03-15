package org.capg.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("org.capg")
public class SpringBootWebProjectDay3Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWebProjectDay3Application.class, args);
	}

}
