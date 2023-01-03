package com.nitin.gettingstartspringbootjpa.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nitin.gettingstartspringbootjpa.course.Course;

@Component
public class CourseCommanLineRunner implements CommandLineRunner{

	@Autowired
	CourseJDBCRepository repository;
	
	
	@Override
	public void run(String... args) throws Exception {

		repository.insert(new Course(1L, "Getting Started JDBC", "Nitin Gaikwad"));
		
		repository.insert(new Course(2L, "Getting Started JAVA", "Nitin Gaikwad"));
		
		repository.insert(new Course(3L, "Getting Started AWS", "Nitin Gaikwad"));
		
		repository.delete(2L);
		
		System.out.println("++++Coursr Details is +++"+repository.findById(1L));
		
		System.out.println("++++Coursr Details is +++"+repository.findById(3L));
		
		
	}
	
	

}
