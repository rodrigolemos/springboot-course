package com.rodrigolemos.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rodrigolemos.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
