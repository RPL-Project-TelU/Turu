package com.example.tubes_learnlish.Quiz.Repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.tubes_learnlish.Quiz.Model.Result;

@Repository
public interface ResultRepo extends JpaRepository<Result, Integer> {
    
}
