package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class FirstProjectApplication {

	public static void main(String[] args) {
		
//		SpringApplication.run(FirstProjectApplication.class, args); 												// 1)
//		System.out.println("Hey ... It's working!");	  															// 1)
		
//		ConfigurableApplicationContext context = SpringApplication.run(FirstProjectApplication.class, args);		// 2)
//		Student s = context.getBean(Student.class);																	// 2)
//		s.show();																									// 2)
		
//		ConfigurableApplicationContext context = SpringApplication.run(FirstProjectApplication.class, args);		// 3.1)
//		Student s = context.getBean(Student.class);																	// 3.2)
//		s.show();																									// 3.3)
		
//		ConfigurableApplicationContext context = SpringApplication.run(FirstProjectApplication.class, args);		// 4.1)
		
//		Student s1 = context.getBean(Student.class);																// 4.2)
//		s1.show();																									// 4.3)
//		
//		Student s2 = context.getBean(Student.class);																// 4.4)
//		s2.show();																									// 4.5)
		
		ConfigurableApplicationContext context = SpringApplication.run(FirstProjectApplication.class, args);		// 5)
		
		Student s = context.getBean(Student.class);																	// 5)
		s.show();		
		
	}

}
