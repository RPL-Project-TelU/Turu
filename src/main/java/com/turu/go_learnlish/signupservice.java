package com.turu.go_learnlish;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class signupservice {
    
    @Autowired
    private signuprepo signupRepo;
    
    public signup save(signup Signup){
        return signupRepo.save(Signup);
    }

    public signup findOne(int id){
        Optional<signup> Signup = signupRepo.findById(id);
        if(!Signup.isPresent()){
            return null;
        }
        return Signup.get();
    }

    public Iterable<signup> findAll(){
        return signupRepo.findAll();
    }

    public void removeOne(int id){
        signupRepo.deleteById(id);
    }

    public List<signup> findByUsername(String username){
        return signupRepo.findByUsernameContains(username);
    }

}
