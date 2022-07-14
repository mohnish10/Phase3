package com.simplilearn.springboot;

import org.springframework.stereotype.Component;

@Component("Marks")
public class Marks 
{
private int phyMarks;
private int chemMarks;
private int bioMarks;

public int getPhyMarks() {
	return phyMarks;
}
public void setPhyMarks(int phyMarks) {
	this.phyMarks = phyMarks;
}
public int getChemMarks() {
	return chemMarks;
}
public void setChemMarks(int chemMarks) {
	this.chemMarks = chemMarks;
}
public int getBioMarks() {
	return bioMarks;
}
public void setBioMarks(int bioMarks) {
	this.bioMarks = bioMarks;
}
public static void calculate() 
{
System.out.println("Let's calculate the total marks now");
	
}









}
