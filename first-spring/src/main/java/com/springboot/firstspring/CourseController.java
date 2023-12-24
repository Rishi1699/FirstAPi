package com.springboot.firstspring;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
	
	
	@GetMapping(path="/courses")
	public List<Courses> retrieveAllCourses(){
		// TODO Auto-generated method stub
		return Arrays.asList(
				new Courses(1,"Learn AWS","in28Minutes"),
				new Courses(2,"Learn Devops","in28Minutes")
				);

	}

}
