package com.spring.core.demo;

//AppConfig.java
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	 @Bean
	 public Student student() {
	     return new Student("Alice");
	 }
	
	 @Bean
	 public Course course() {
	     return new Course("Introduction to Computer Science");
	 }
	
	 @Bean
	 public Professor professor() {
	     return new Professor("Dr. Smith");
	 }
	
	 @Bean
	 public University university(Student student, Course course) {
	     University university = new University(student, course);
	     university.setProfessor(professor());
	     return university;
	 }
}
