package com.glearning.springdemo.serviceContarct;

import com.glearning.springdemo.model.Course;

public interface ServiceContract {

	Course getCourse();

	//Course postCourse(String courseName, String courseType, String instructorName);

	Course postCourse(String courseName, String courseType, String firstName, String lastName);

}