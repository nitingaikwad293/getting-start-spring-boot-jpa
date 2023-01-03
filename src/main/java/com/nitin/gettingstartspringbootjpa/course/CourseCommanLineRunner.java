package com.nitin.gettingstartspringbootjpa.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nitin.gettingstartspringbootjpa.course.springjpa.CourseSpringJpaReposiotry;

@Component
public class CourseCommanLineRunner implements CommandLineRunner{

	//@Autowired
	//CourseJDBCRepository repository; 
	
	//@Autowired
	//CourseJPARepository repository;
	
	@Autowired
	CourseSpringJpaReposiotry repository;
	
	@Override
	public void run(String... args) throws Exception {

		//repository.insert(new Course(1L, "Getting Started JDBC By JPA ", "Nitin Gaikwad"));
		
		//repository.insert(new Course(2L, "Getting Started JAVA By JPA " , "Nitin Gaikwad"));
		
		//repository.insert(new Course(3L, "Getting Started AWS By JPA ", "Nitin Gaikwad"));
		
		//repository.delete(2L);
		
		//System.out.println("++++Coursr Details is +++"+repository.findById(1L));
		
		//System.out.println("++++Coursr Details is +++"+repository.findById(3L));
		
		
		repository.save(new Course(1L, "Getting Started JDBC By JPA ", "Nitin Gaikwad"));
		
		repository.save(new Course(2L, "Getting Started JAVA By JPA " , "Nitin Gaikwad"));
				
		repository.save(new Course(3L, "Getting Started AWS By JPA ", "Nitin Gaikwad"));
		
		System.out.println("++++Coursr Details is +++"+repository.findById(1L));
		
		System.out.println("++++Coursr Details is +++"+repository.findById(3L));
		
		System.out.println(repository.findByNameAndId("Getting Started AWS By JPA ", 3L));
		
		
	}
	
	

}
