package com.study.springboot.learnjpaandhibernate.course.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.study.springboot.learnjpaandhibernate.course.jdbc.Course;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class CourseJpaRepository {
	
	@PersistenceContext
	private EntityManager entityManager;
	public void insert(Course course) {
		entityManager.merge(course);
		
	}
	public void deleteById(long id) {
		// TODO Auto-generated method stub
		Course course= entityManager.find(Course.class, id);
		entityManager.remove(course);
		
	}
	public Course findById(long id) {
		// TODO Auto-generated method stub
		return entityManager.find(Course.class,id);
	}
	
	
	

}
