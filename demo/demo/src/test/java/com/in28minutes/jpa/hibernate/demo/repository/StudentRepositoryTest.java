package com.in28minutes.jpa.hibernate.demo.repository;

import javax.persistence.EntityManager;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;	
import org.springframework.test.context.junit4.SpringRunner;
import com.in28minutes.jpa.hibernate.demo.DemoApplication;
import com.in28minutes.jpa.hibernate.demo.entity.Course;
import com.in28minutes.jpa.hibernate.demo.entity.Student;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DemoApplication.class)
class StudentRepositoryTest {

	private Logger logger = LoggerFactory.getLogger(StudentRepository.class);
	@Autowired
	StudentRepository studentRepository;
	@Autowired
	EntityManager em;
	
	@Test
	void retriveStudentAndPassport() {
		Student st= em.find(Student.class,201);
		logger.info("Student : "+st);
		logger.info("Student passport : "+st.getPassport());
	}

}
