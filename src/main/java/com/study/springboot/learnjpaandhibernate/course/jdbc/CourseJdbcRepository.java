package com.study.springboot.learnjpaandhibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

@Component
public class CourseJdbcRepository {
    @Autowired
	private JdbcTemplate jdbcTemplate;
	private static String  INSERT_QUERY=
			"""
			insert into course (ID, NAME, AUTHER)  values  (?, ?, ?)
			""";
	private static String DELETE_QUERY=
			"""
			delete from course where id=?
			""";
	private static String SELECT_QUERY=
			"""
			select * from course where id=?
			""";
	public void insert(Course course) {
		jdbcTemplate.update(INSERT_QUERY, course.getId(),course.getName(),course.getAuther());
	}
	
	public void deleteById(long id) {
		jdbcTemplate.update(DELETE_QUERY,id);
	}
	
	public Course findById(long id) {
		return jdbcTemplate.queryForObject(SELECT_QUERY,new BeanPropertyRowMapper<>(Course.class), id);
	}
	}
