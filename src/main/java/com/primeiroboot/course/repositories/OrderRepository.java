package com.primeiroboot.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.primeiroboot.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
