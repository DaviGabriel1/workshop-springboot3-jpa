package com.primeiroboot.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.primeiroboot.course.entities.OrderItem;
import com.primeiroboot.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem,OrderItemPK>{

}

