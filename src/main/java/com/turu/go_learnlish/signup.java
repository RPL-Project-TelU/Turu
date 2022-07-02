package com.turu.go_learnlish;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "signup") 
public class signup implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    @Column(name ="username", length=50)
    private String username;
    @Column(name = "password", length=50)
    private String password;
    public signup(int id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }
    

    
}
