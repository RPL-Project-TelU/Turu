package com.turu.go_learnlish;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/signup")
public class signupcontroller {
    
    @Autowired
    private signupservice signupService;


    @PostMapping
    public signup create(@RequestBody signup Signup){
        return signupService.save(Signup);
    }

    @GetMapping
    public Iterable<signup> findAll(){
        return signupService.findAll();
    }

    @GetMapping("/{id}")
    public signup findOne(@PathVariable("id") int id){
        return signupService.findOne(id);
    }

    @PutMapping
    public signup update(@RequestBody signup Signup){
        return signupService.save(Signup);
    }

    @DeleteMapping("/{id}")
    public void removeOne(@PathVariable("id") int id){
        signupService.removeOne(id);
}
}