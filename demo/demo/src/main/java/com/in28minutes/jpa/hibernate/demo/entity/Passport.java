package com.in28minutes.jpa.hibernate.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Passport {
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String number;

	protected Passport() {
		
	}
	public Passport(String number) {
		super();
		this.number = number;
	}

	public String getName() {
		return number;
	}

	public void setName(String number) {
		this.number = number;
	}
	
	public Long getId() {
		return id;
	}
	@Override
	public String toString() {
		return "Passport [id=" + id + ", name=" + number + "]";
	}
	
	
}
