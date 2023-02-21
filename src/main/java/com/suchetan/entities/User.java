package com.suchetan.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {
	
	@Override
	public String toString() {
		return "User [userId=" + userId + ", name=" + name + ", city=" + city + ", status=" + status + "]";
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userId;
	private String name;
	private String city;
	private String status;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(int userId, String name, String city, String status) {
		super();
		this.userId = userId;
		this.name = name;
		this.city = city;
		this.status = status;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
}
