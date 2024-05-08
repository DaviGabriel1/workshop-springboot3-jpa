package com.primeiroboot.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.primeiroboot.course.entities.User;
import com.primeiroboot.course.services.UserService;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@Autowired
	private UserService service;
	
	@GetMapping
	public ResponseEntity<List<User>> findAll(){
		List<User> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	@GetMapping(value = "/{id}")
	public ResponseEntity<User> findById(@PathVariable Long id){//assinatura para o id do parâmetro ser o mesmo do caminho
		User obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
