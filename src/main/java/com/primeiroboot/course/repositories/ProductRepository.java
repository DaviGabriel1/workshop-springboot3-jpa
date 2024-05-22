package com.primeiroboot.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.primeiroboot.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
