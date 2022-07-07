package com.simplilearn.spring;

public class Student {

private int id;
private MathCheat mathCheat;

public Student(int id, MathCheat mathCheat) {
	this.id = id;
	this.mathCheat = mathCheat;
}

public void cheating()
{
System.out.println("My id is :"+id);
mathCheat.mathCheating();
}
}
