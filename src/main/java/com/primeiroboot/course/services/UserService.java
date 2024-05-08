package com.primeiroboot.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.primeiroboot.course.repositories.UserRepository;
import com.primeiroboot.course.entities.User;

//@Component registra a classe como um componente do Spring (Permite a injeção com o autowired)
@Service //tem praticamente a mesma função do component, mas é mais semanticamente correto
public class UserService {
	@Autowired //faz uma implicitação da injeção de dependencias
	private UserRepository repository;
	
	public List<User> findAll(){
		return repository.findAll();
	}
	
	public User findById(Long id) {
		Optional<User> obj = repository.findById(id);
		return obj.get();
	}
	
}
