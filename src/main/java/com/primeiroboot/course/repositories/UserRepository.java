package com.primeiroboot.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.primeiroboot.course.entities.User;
//@Repository não é necessário pois já herda JpaRepository, que tem a assinatura 
public interface UserRepository extends JpaRepository<User, Long>{//entidade e tipo da chave
	

}
