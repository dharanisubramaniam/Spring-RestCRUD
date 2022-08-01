package com.glearning.springdemo.service;

import org.springframework.stereotype.Service;

import com.glearning.springdemo.model.Course;
import com.glearning.springdemo.model.FullName;
import com.glearning.springdemo.serviceContarct.ServiceContract;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class ServiceImplementation implements ServiceContract {
	
	@Override
	public Course getCourse() {
		log.info("inide get() course");
		Course spring = new Course();
		spring.setCourseName("spring boot");
		spring.setCourseType("IT");
		spring.setInstructorName(FullName.builder().fullName("dhar").lastName("subra").build());
		return spring;
	}
	
	@Override
	public Course postCourse(String courseName,String courseType,String firstName,String lastName) {
		log.info("inide postCourse() course");
		Course springPost = new Course();
		springPost.setCourseName(courseName);
		springPost.setCourseType(courseType);
		springPost.setInstructorName(FullName.builder().fullName(firstName).lastName(lastName).build());
		return springPost;
	}

}
