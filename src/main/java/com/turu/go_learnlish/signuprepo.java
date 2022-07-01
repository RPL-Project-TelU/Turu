package com.turu.go_learnlish;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface signuprepo extends CrudRepository<signup, Integer> {
    
    List<signup> findByUsernameContains(String username);
}
