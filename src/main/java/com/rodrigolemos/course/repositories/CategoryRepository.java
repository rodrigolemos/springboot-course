package com.rodrigolemos.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rodrigolemos.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
