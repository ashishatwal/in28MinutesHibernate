package com.in28minutes.jpa.hibernate.demo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.in28minutes.jpa.hibernate.demo.entity.Course;
import com.in28minutes.jpa.hibernate.demo.repository.CourseRepository;

@SpringBootApplication
public class DemoApplicationTests implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(DemoApplicationTests.class);
	@Autowired
	CourseRepository courseRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(DemoApplicationTests.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Course course =courseRepository.findById(1L);
		logger.info("FindCourse : "+course);
	}

}
