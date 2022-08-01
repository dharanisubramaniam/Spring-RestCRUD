package com.glearning.springdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.glearning.springdemo.model.Course;
import com.glearning.springdemo.serviceContarct.ServiceContract;

//@Controller
@RestController
public class CourseController {

	@Autowired
	ServiceContract serviceImplementation;
	
	@GetMapping("/info")
	//@ResponseBody
	public Course getCourse() {
		
		return serviceImplementation.getCourse();
	}
	
	@PostMapping("/postInfo")
	public Course postCourse(String courseName,String courseType,String firstName,String lastname) {
		
		return serviceImplementation.postCourse(courseName, courseType, firstName,lastname);
	}
	
	
}
