package com.nitin.gettingstartspringbootjpa.course.springjpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nitin.gettingstartspringbootjpa.course.Course;

public interface CourseSpringJpaReposiotry extends JpaRepository<Course, Long> {
	
	public List<Course> findByNameAndId(String name, long id);

}
