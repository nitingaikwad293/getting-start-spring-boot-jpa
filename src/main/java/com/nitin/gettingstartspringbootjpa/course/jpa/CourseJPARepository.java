package com.nitin.gettingstartspringbootjpa.course.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nitin.gettingstartspringbootjpa.course.Course;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class CourseJPARepository {

	@Autowired
	private EntityManager entityManager;
	
	
	public void insert(Course course) {
		entityManager.merge(course);
	}
	
	public Course findById(long courseId) {
		return entityManager.find(Course.class, courseId);
	}
	
	public void delete(long courseId) {
		
		Course course = entityManager.find(Course.class, courseId);
		entityManager.remove(course);
	}
	
}
