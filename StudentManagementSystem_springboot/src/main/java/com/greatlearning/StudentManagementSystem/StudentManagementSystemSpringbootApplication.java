package com.greatlearning.StudentManagementSystem;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentManagementSystemSpringbootApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemSpringbootApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Hellow Spring boot");
		
	}

}
