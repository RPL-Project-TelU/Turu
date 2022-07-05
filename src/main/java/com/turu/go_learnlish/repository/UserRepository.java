package com.turu.go_learnlish.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.turu.go_learnlish.entity.User;

public interface UserRepository extends JpaRepository<User, Long > {
    
}