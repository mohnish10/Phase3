package com.simplilearn.sportyshoes.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Shoes {

@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int id;
private int quantity;
private float price;
private int size;
private String name;
private String colour;




public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public float getPrice() {
	return price;
}
public void setPrice(float price) {
	this.price = price;
}
public int getSize() {
	return size;
}
public void setSize(int size) {
	this.size = size;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getColour() {
	return colour;
}
public void setColour(String colour) {
	this.colour = colour;
}


public Shoes(int quantity, float price, int size, String name, String colour) {
	super();
	this.quantity = quantity;
	this.price = price;
	this.size = size;
	this.name = name;
	this.colour = colour;
}


public Shoes()
{
super();	
}






}
