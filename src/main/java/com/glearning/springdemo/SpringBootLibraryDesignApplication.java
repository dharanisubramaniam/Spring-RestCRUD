package com.glearning.springdemo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import com.glearning.springdemo.model.Course;
import com.glearning.springdemo.model.FullName;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
@Slf4j
public class SpringBootLibraryDesignApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootLibraryDesignApplication.class, args);
		System.out.println("hello dhar");

	}

	@Override
	public void run(String... args) throws Exception {
		//telescopic constructor injection pattern
//		Course course = new Course("spring boot","Full Stack Dev","Samarth");
//		 System.out.println("course obj"+course);
		 
		 //builder pattern lombok instaed of telescopic constructor
//		 Course builderPattern =  Course.builder().courseName("builder pattern").courseType("lombok")
//				 .build();
//				
//		 System.out.println("course obj"+builderPattern);
		
		
		
		//builder pattern for complex objects(refer fulname class)
		Course complexObject = Course.builder().courseName("complex object").courseType("IT")
				.instructorName(FullName.builder().fullName("dhar").lastName("subra").build()).build();
		//System.out.println("course obj"+complexObject);
		
		//slf4j implementation example
		log.info("complex object example -> {} ",complexObject);
		
		
		//demonstrating getter and setter using lombok annotations
//		Course course1 = new Course();
//		course.setCourseName("spring boot");
//		course.setCourseType("Full Stack Dev");
//		 System.out.println("course obj"+course);
		
		
		// default constructor
		// Course course = new Course();
		// args cons
		// Course courseDS = new Course("DS","Full Stack Dev","CSDojo");
		// System.out.println("DSCourse"+courseDS);
		// setters methods
		// course.setCourseName("spring boot");
		// course.setCourseType("Full Stack Dev");
		// course.setInstructorName("Samarth");
		// to string
		// System.out.println("course obj"+course);
		// getters methods
		// System.out.println("course
		// obj"+course.getCourseName()+course.getCourseType()+course.getInstructorName());

	}

}
