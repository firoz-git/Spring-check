package com.learn.first;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//http://localhost:8080/course
public class CourseController {
	@GetMapping("/course")
	public List<Course> getAllCourses(){
		return Arrays.asList(new Course( 1 , "Firoskhan" , "kollam" ),new Course( 1 , "Firoskhan" , "kollam" ));
		//it is the list of courses
	}
	
	@GetMapping("/course/1")
	public Course getCourseDetails() {
		return new Course( 2 ,"ajmal25","kollam");
	
	}
}