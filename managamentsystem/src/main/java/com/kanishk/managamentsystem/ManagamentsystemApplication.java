package com.kanishk.managamentsystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.kanishk.managamentsystem.entity.StudentManag;

@SpringBootApplication
public class ManagamentsystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(ManagamentsystemApplication.class, args);
		//System.out.print(StudentManag.id);
	}
  
}
