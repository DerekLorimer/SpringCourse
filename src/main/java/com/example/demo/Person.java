package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Person {
	
	@Id
	int id;	
	String firstName;
	String surname;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	
	
	

}
