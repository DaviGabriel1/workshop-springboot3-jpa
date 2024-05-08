package com.primeiroboot.course.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.primeiroboot.course.entities.User;
import com.primeiroboot.course.repositories.UserRepository;

@Configuration
@Profile("test") //nome igual o profile
public class TestConfig implements CommandLineRunner{
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		User u1 = new User(null,"Maria Brown","maria@gmail.com","9888888","123456");
		User u2 = new User(null,"Davi Gabriel","davi@gmail.com","97777777","123");
		
		userRepository.saveAll(Arrays.asList(u1,u2));
	}
	
	
}
