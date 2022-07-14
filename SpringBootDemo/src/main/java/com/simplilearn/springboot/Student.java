package com.simplilearn.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("Student")
public class Student 
{
private String name;
private int rollNo;
private String city;
@Autowired
@Qualifier("Marks")
private Marks marks;




public Marks getMarks() {
	return marks;
}
public void setMarks(Marks marks) {
	this.marks = marks;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getRollNo() {
	return rollNo;
}
public void setRollNo(int rollNo) {
	this.rollNo = rollNo;
}
public String getCity() {
	return city;
}
public void setCity(String address) {
	this.city = address;
}
public Student() {
	super();
}
public Student(String name, int rollNo, String address) {
	super();
	this.name = name;
	this.rollNo = rollNo;
	this.city = address;
}


public void show()
{
System.out.println("Welcome Students");	
}


public void marksCalculation()
{
Marks.calculate();	
}



}
