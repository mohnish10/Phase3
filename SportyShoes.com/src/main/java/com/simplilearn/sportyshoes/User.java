package com.simplilearn.sportyshoes;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;





@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int user_id;
	private String user_fname;
	private String user_lname;
	private String user_phone;
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getUser_fname() {
		return user_fname;
	}
	public void setUser_fname(String user_fname) {
		this.user_fname = user_fname;
	}
	public String getUser_lname() {
		return user_lname;
	}
	public void setUser_lname(String user_lname) {
		this.user_lname = user_lname;
	}
	public String getUser_phone() {
		return user_phone;
	}
	public void setUser_phone(String user_phone) {
		this.user_phone = user_phone;
	}
	public String getUser_mail() {
		return user_mail;
	}
	public void setUser_mail(String user_mail) {
		this.user_mail = user_mail;
	}
	public String getUser_dob() {
		return user_dob;
	}
	public void setUser_dob(String user_dob) {
		this.user_dob = user_dob;
	}
	public String getUser_pass() {
		return user_pass;
	}
	public void setUser_pass(String user_pass) {
		this.user_pass = user_pass;
	}
	public String getUser_conpass() {
		return user_conpass;
	}
	public void setUser_conpass(String user_conpass) {
		this.user_conpass = user_conpass;
	}
	public String getUser_state() {
		return user_state;
	}
	public void setUser_state(String user_state) {
		this.user_state = user_state;
	}
	public String getUser_dist() {
		return user_dist;
	}
	public void setUser_dist(String user_dist) {
		this.user_dist = user_dist;
	}
	public String getUser_taluka() {
		return user_taluka;
	}
	public void setUser_taluka(String user_taluka) {
		this.user_taluka = user_taluka;
	}
	public String getUser_pin() {
		return user_pin;
	}
	public void setUser_pin(String user_pin) {
		this.user_pin = user_pin;
	}
	public String getUser_gender() {
		return user_gender;
	}
	public void setUser_gender(String user_gender) {
		this.user_gender = user_gender;
	}
	private String user_mail;
	private String user_dob;
	private String user_pass;
	private String user_conpass;
	private String user_state;
	private String user_dist;
	private String user_taluka;
	private String user_pin;
	private String user_gender;
	
	
	
	
	
	
	
	
	
	
	
		
}
