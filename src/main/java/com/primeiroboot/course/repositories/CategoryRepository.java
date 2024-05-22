package com.primeiroboot.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.primeiroboot.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category,Long>{

}
