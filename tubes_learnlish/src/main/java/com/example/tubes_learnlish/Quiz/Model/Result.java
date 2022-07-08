package com.example.tubes_learnlish.Quiz.Model;

import javax.annotation.processing.Generated;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cglib.reflect.MethodDelegate.Generator;
import org.springframework.stereotype.Component;

@Component
@EntityScan
@Table(name = "results")
public class Result {

	@Id
	@Generated(strategy = Generator.IDENTITY)
	private int id;
	private String username;
	private int totalCorrect = 0;

	public Result() {
		super();
	}

	public Result(int id, String username, int totalCorrect) {
		super();
		this.id = id;
		this.username = username;
		this.totalCorrect = totalCorrect;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getTotalCorrect() {
		return totalCorrect;
	}

	public void setTotalCorrect(int totalCorrect) {
		this.totalCorrect = totalCorrect;
	}

}
