package com.rodrigolemos.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rodrigolemos.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
