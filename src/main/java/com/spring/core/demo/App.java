package com.spring.core.demo;
//MainApp.java
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
 public static void main(String[] args) {
     try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class)) {
         // Retrieve the University bean from the context
         University university = context.getBean(University.class);

         // Use the University object
         university.displayUniversityInfo();
     }
 }
}
