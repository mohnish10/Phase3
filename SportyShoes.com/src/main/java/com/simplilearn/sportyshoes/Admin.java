package com.simplilearn.sportyshoes;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Admin {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int ad_id;
	public int getAd_id() {
		return ad_id;
	}

	public void setAd_id(int ad_id) {
		this.ad_id = ad_id;
	}

	public String getAd_fname() {
		return ad_fname;
	}

	public void setAd_fname(String ad_fname) {
		this.ad_fname = ad_fname;
	}

	public String getAd_lname() {
		return ad_lname;
	}

	public void setAd_lname(String ad_lname) {
		this.ad_lname = ad_lname;
	}

	public String getAd_phone() {
		return ad_phone;
	}

	public void setAd_phone(String ad_phone) {
		this.ad_phone = ad_phone;
	}

	public String getAd_mail() {
		return ad_mail;
	}

	public void setAd_mail(String ad_mail) {
		this.ad_mail = ad_mail;
	}

	public String getAd_dob() {
		return ad_dob;
	}

	public void setAd_dob(String ad_dob) {
		this.ad_dob = ad_dob;
	}

	public String getAd_pass() {
		return ad_pass;
	}

	public void setAd_pass(String ad_pass) {
		this.ad_pass = ad_pass;
	}

	public String getAd_con() {
		return ad_con;
	}

	public void setAd_con(String ad_con) {
		this.ad_con = ad_con;
	}

	public String getAd_state() {
		return ad_state;
	}

	public void setAd_state(String ad_state) {
		this.ad_state = ad_state;
	}

	public String getAd_dist() {
		return ad_dist;
	}

	public void setAd_dist(String ad_dist) {
		this.ad_dist = ad_dist;
	}

	public String getAd_taluka() {
		return ad_taluka;
	}

	public void setAd_taluka(String ad_taluka) {
		this.ad_taluka = ad_taluka;
	}

	public String getAd_pin() {
		return ad_pin;
	}

	public void setAd_pin(String ad_pin) {
		this.ad_pin = ad_pin;
	}

	public String getAd_gen() {
		return ad_gen;
	}

	public void setAd_gen(String ad_gen) {
		this.ad_gen = ad_gen;
	}

	public String getLog_date() {
		return log_date;
	}

	public void setLog_date(String log_date) {
		this.log_date = log_date;
	}

	private String ad_fname;
	private String ad_lname;
	private String ad_phone;
	private String ad_mail;
	private String ad_dob;
	private String ad_pass;
	private String ad_con;
	private String ad_state;
	private String ad_dist;
	private String ad_taluka;
	private String ad_pin;
	private String ad_gen;
	
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String log_date;
	
}