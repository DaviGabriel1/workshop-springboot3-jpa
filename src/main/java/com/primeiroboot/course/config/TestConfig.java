package com.primeiroboot.course.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.primeiroboot.course.entities.Order;
import com.primeiroboot.course.entities.User;
import com.primeiroboot.course.entities.enums.OrderStatus;
import com.primeiroboot.course.repositories.OrderRepository;
import com.primeiroboot.course.repositories.UserRepository;

@Configuration
@Profile("test") //nome igual o profile
public class TestConfig implements CommandLineRunner{
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private OrderRepository orderRepository;

	@Override
	public void run(String... args) throws Exception {
		User u1 = new User(null,"Maria Brown","maria@gmail.com","9888888","123456");
		User u2 = new User(null,"Davi Gabriel","davi@gmail.com","97777777","123");
		
		Order o1 = new Order(null,Instant.parse("2024-04-20T19:53:07Z"),OrderStatus.PAID,u1); //"Z" padrao UTC, horario de greenwich
		Order o2 = new Order(null,Instant.parse("2024-05-04T03:42:10Z"),OrderStatus.WAITING_PAYMENT,u2);
		Order o3 = new Order(null,Instant.parse("2024-05-09T10:32:19Z"),OrderStatus.WAITING_PAYMENT,u1);
		
		userRepository.saveAll(Arrays.asList(u1,u2));
		orderRepository.saveAll(Arrays.asList(o1,o2,o3));
	}
	
	
}
