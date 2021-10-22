package com.example.demo;

import com.example.demo.entity.passport;
import com.example.demo.service.passportservice;
import com.example.demo.service.studentservice;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.transaction.Transactional;

@SpringBootApplication
public class DemoApplication {


	@Autowired
	studentservice studentService;

	@Autowired
	passportservice passportService;

	//@Autowired
//	CourseService courseService;

	static final Logger log=
			LoggerFactory.getLogger(DemoApplication.class);


	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}


}
