package com.javabrains.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.javabrains.topic"})
public class RevisionSpring1Application {

	public static void main(String[] args) {
		SpringApplication.run(RevisionSpring1Application.class, args);
	}

}
