package com.simplilearn.springboot;

import java.util.Arrays;

public class ProductNotFoundException extends RuntimeException
{
public ProductNotFoundException()
{
super();	
}
	
public ProductNotFoundException(String mes)
{
super(mes);	
}

@Override
public String toString() {
	return "ProductNotFoundException " + super.toString();
}








	

}
