package com.spring.core.demo;

//University.java
public class University {
	 private Student student;
	 private Course course;
	 private Professor professor;
	
	 // Constructor with Student and Course dependencies (DI)
	 public University(Student student, Course course) {
	     this.student = student;
	     this.course = course;
	 }
	
	 // Setter for Professor dependency (DI)
	 public void setProfessor(Professor professor) {
	     this.professor = professor;
	 }
	
	 public void displayUniversityInfo() {
	     System.out.println("Student: " + student.getName());
	     System.out.println("Course: " + course.getName());
	     System.out.println("Professor: " + (professor != null ? professor.getName() : "N/A"));
	 }
}

