package com.turu.go_learnlish.controller;

import com.fasterxml.jackson.annotation.JsonCreator.Mode;
import com.turu.go_learnlish.configuration.PasswordEncoder;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.turu.go_learnlish.entity.User;
import com.turu.go_learnlish.repository.UserRepository;


@Controller
public class AppController {
    
    @Autowired
    private UserRepository repo;

    @GetMapping("")
    public String viewHomePage(){
        return "Index";
    }

    @GetMapping("/register")
    public String showSignupForm(Model model){
        model.addAttribute("user", new User());
        
        return "signup_form";
    }

    @PostMapping("/process_register")
    public String processRegistration(User user){
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String encodedPassword = encoder.encode(user.getPassword());
        user.setPassword(encodedPassword);
        repo.save(user);

        return "register_success";
    }

    @GetMapping("users")
    public String viewUsersList(Model model){
        List<User> listusers = repo.findAll();
        model.addAttribute("listUsers", listusers);
        return "users";
    }
}
