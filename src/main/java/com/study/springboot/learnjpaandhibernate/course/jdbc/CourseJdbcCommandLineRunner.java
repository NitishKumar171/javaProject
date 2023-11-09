package com.study.springboot.learnjpaandhibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.study.springboot.learnjpaandhibernate.course.jpa.CourseJpaRepository;
import com.study.springboot.learnjpaandhibernate.course.jpa.CourseSpringDataJpaRepository;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner{
	
//	@Autowired
	//private CourseJdbcRepository repository;
	//@Autowired
	//private CourseJpaRepository repository;
	@Autowired
	private CourseSpringDataJpaRepository repository;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		repository.save(new Course(1,"Ankita Sen","Core Java"));
		repository.save(new Course(2,"Bebika Sen","AWS Architech"));
		repository.save(new Course(3,"S.Krishnan","Dev Ops"));
		repository.save(new Course(4,"Nitesh Ranjan","Physics"));
	
		System.out.println(repository.findById(4));
		System.out.println(repository.findByAuther("Core Java"));

		
	}

}
