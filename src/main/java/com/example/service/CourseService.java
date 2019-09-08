package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Course;
import com.example.repository.CourseRepository;

@Service
public class CourseService {
	
	@Autowired
	CourseRepository courseRepository;
	
	public void save(Course course) {
		courseRepository.save(course);
	}
	
	public List<Course> getAll(){
		return (List<Course>) courseRepository.findAll();
	}

}
