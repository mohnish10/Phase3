package com.simplilearn.springsecurity;

public class User {

private String name;
private String password;
private String role;

public String getName() {
	return name;
}
public User(String name, String password, String role) {
	super();
	this.name = name;
	this.password = password;
	this.role = role;
}

public void setName(String name) {
	this.name = name;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getRole() {
	return role;
}
public User() {
	super();
	// TODO Auto-generated constructor stub
}

public void setRole(String role) {
	this.role = role;
}



	
	
	
	
	
}
