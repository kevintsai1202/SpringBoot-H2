package com.kt.jpa;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

import com.kt.jpa.entity.User;
import com.kt.jpa.repository.UserRepository;

import jakarta.transaction.Transactional;

@SpringBootTest
class SpringBootH2ApplicationTests {

	@Autowired
	UserRepository userRepository;
	
	@Test
	void contextLoads1() {
		User user = User.builder()
				.userName("kevin2")
				.password("test2")
				.build();
		
		userRepository.save(user);
		assertEquals(userRepository.count(), 2);
	}
	@Test
	void contextLoads2() {
		System.out.println(userRepository.findAll());
	}
	
	@Test
	@Transactional
	@Rollback(value = false)
	void contextLoads3() {
		User user= userRepository.getReferenceById(1);
		user.setPassword("abc123");
		userRepository.save(user);
		
//		System.out.println(userRepository.findAll());
	}
	
	@Test
	void contextLoads4() {
		User user = User.builder()
				.id(100)
				.userName("kevin")
				.password("test")
				.build();
		userRepository.save(user);
	}
	
	@Test
	@Transactional
	@Rollback(value = false)
	void contextLoads5() {
		userRepository.deleteById(2);
	}


}
