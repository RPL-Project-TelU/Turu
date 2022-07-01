package com.turu.go_learnlish;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
 
@RestController
@RequestMapping("/api/welcome")
public class HelloSvc {

   public String welcome(){
    return "welcome to springboot api";
   }

    }
