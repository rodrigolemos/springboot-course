package com.rodrigolemos.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rodrigolemos.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
