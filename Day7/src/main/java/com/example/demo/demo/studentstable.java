package com.example.demo;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;

import java.lang.String;
@Entity
public class studentstable {
	
	@Id
	private int Id;
	private String name;
	@Transient
	private int num;
	public studentstable(int Id, String name) {
		super();
		this.Id=Id;
		this.name = name;
	}
	public studentstable() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return Id;
	}
	public void setId(int Id) {
		this.Id = Id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
