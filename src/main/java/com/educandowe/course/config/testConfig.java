package com.educandowe.course.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.educandowe.course.entities.User;
import com.educandowe.course.repositories.UserRepository;

@Configuration
@Profile("test")
public class testConfig implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null,"Maria Brown", "maria@gmail.com", "988888", "123456" );
		User u2 = new User(null, "Alex Gren", "alex@gmail.com", "977777777", "1234567");
		
		userRepository.saveAll(Arrays.asList(u1,u2));
		
	}

	
}