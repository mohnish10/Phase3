package com.simplilearn.spring;

public class Student {
private String name;
private int id;




public Student(String name)
{
this.name=name;	
}


public Student(int id)
{
this.id=id;	
}

public Student(String name, int id)
{
this.name=name;
this.id=id;
}


public String getName() {
	return name;
}


public int getId() {
	return id;
}








}





