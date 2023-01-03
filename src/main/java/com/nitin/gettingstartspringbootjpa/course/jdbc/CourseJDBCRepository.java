package com.nitin.gettingstartspringbootjpa.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.nitin.gettingstartspringbootjpa.course.Course;

@Repository
public class CourseJDBCRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	private static String SQL_INSERT = """
			insert into course(id,name,author)
			values (? ,?,?)
			""";
	
  private static String SQL_DELETE = """
			delete from  course where id = ?
			""";

  private static String SQL_SELECT = """
			select * from  course where id = ?
			""";


  
	public void insert(Course course) {
		
		jdbcTemplate.update(SQL_INSERT,course.getId(),course.getName(),course.getAuthor());
	}
	
   public void delete(Long courseId) {
		
		jdbcTemplate.update(SQL_DELETE,courseId);
	}
   
   
   public Course findById(Long courseId) {
		
		return jdbcTemplate.queryForObject(SQL_SELECT, new BeanPropertyRowMapper<>(Course.class), courseId);
	}

	
	
}
