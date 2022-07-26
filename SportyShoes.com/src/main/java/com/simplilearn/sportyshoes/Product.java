package com.simplilearn.sportyshoes;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.servlet.jsp.tagext.TryCatchFinally;

import org.springframework.data.jpa.provider.HibernateUtils;




@Entity
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int pro_id;
	public int getPro_id() {
		return pro_id;
	}
	public void setPro_id(int pro_id) {
		this.pro_id = pro_id;
	}
	public String getPro_code() {
		return pro_code;
	}
	public void setPro_code(String pro_code) {
		this.pro_code = pro_code;
	}
	public String getPro_name() {
		return pro_name;
	}
	public void setPro_name(String pro_name) {
		this.pro_name = pro_name;
	}
	public String getPro_brand() {
		return pro_brand;
	}
	public void setPro_brand(String pro_brand) {
		this.pro_brand = pro_brand;
	}
	public String getPro_price() {
		return pro_price;
	}
	public void setPro_price(String pro_price) {
		this.pro_price = pro_price;
	}
	public String getPro_about() {
		return pro_about;
	}
	public void setPro_about(String pro_about) {
		this.pro_about = pro_about;
	}
	public String getSell_date() {
		return sell_date;
	}
	public void setSell_date(String sell_date) {
		this.sell_date = sell_date;
	}
	private String pro_code;
	private String pro_name;
	private String pro_brand;
	private String pro_price;
	private String pro_about;
	private String sell_date;
	
	

	
	
	
	
//	String pattern = "dd/MM/yyyy";
//	SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
//	String date = simpleDateFormat.format(new Date());

//	private Date timestamp = new Date(System.currentTimeMillis());
	
}
