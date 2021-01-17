package com.rodrigolemos.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rodrigolemos.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
