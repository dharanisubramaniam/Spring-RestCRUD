package com.glearning.springdemo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//@Getter
//@Setter
//@ToString
@NoArgsConstructor
@AllArgsConstructor
//data annotation is equal to the above 5 annotations
@Data
@Builder
public class Course {

	private String courseName;
	private String courseType;
	//complex objects
	//private  String instructorName;
	private FullName instructorName;

	// default constructor

//	public Course() {
//
//	}

	// telescopic constructor design pattern

//	public Course(String courseName) {
//		super();
//		this.courseName = courseName;
//
//	}
//
//	public Course(String courseName, String courseType) {
//		super();
//		this.courseName = courseName;
//		this.courseType = courseType;
//	}

	// all args constructor
//	public Course(String courseName, String courseType, String instructorName) {
//		super();
//		this.courseName = courseName;
//		this.courseType = courseType;
//		this.instructorName = instructorName;
//	}
	// getters and setters

//	public String getCourseName() {
//		return courseName;
//	}
//
//	public void setCourseName(String courseName) {
//		this.courseName = courseName;
//	}
//
//	public String getCourseType() {
//		return courseType;
//	}
//
//	public void setCourseType(String courseType) {
//		this.courseType = courseType;
//	}
//
//	public String getInstructorName() {
//		return instructorName;
//	}
//
//	public void setInstructorName(String instructorName) {
//		this.instructorName = instructorName;
//	}

	// tostring

//	@Override
//	public String toString() {
//		return "Course [courseName=" + courseName + ", courseType=" + courseType + ", instructorName=" + instructorName
//				+ "]";
//	}

}
