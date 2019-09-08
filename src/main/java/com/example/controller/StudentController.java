package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Course;
import com.example.model.Student;
import com.example.service.CourseService;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	CourseService courseService;
	
	@GetMapping("/get/all")
	public List<Course> getAll()	{
		return courseService.getAll();
	}
	
	@GetMapping("/add/{name}")
	public String saveCourse(@PathVariable String name ){
		Student student = new Student();
		student.setName(name);
		
		Course course01 = new Course();
		course01.setCourseName("Urdu");
		course01.setStudents(student);
		courseService.save(course01);
		
		Course course02 = new Course();
		course02.setCourseName("English");
		course02.setStudents(student);		
		courseService.save(course02);
		
		return "Sucess";
	}
}
