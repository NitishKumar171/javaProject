package com.study.springboot.learnjpaandhibernate.course.jpa;



import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.jpa.repository.JpaRepository;
import com.study.springboot.learnjpaandhibernate.course.jdbc.Course;

public interface CourseSpringDataJpaRepository extends JpaRepository<Course, Id>{

	List<Course> findByAuther(String Auther);
	List<Course> findByName(String name);
	List<Course> findById(long id);
}
