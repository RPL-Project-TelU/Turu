package com.example.tubes_learnlish.Quiz.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.tubes_learnlish.Quiz.Model.Question;

@Repository
public interface QuestionRepo extends JpaRepository<Question, Integer>{
    
}
