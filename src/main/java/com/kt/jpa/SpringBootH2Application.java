package com.kt.jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.kt.jpa.entity.User;

@SpringBootApplication
public class SpringBootH2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootH2Application.class, args);
		User user = new User(1, "kevin", "kevin");
				
//				User.builder()
//				.userName("KEVIN")
//				.password("PWD")
//				.build();
	}

}
