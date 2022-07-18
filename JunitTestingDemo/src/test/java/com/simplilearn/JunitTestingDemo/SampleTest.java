package com.simplilearn.JunitTestingDemo;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SampleTest 
{

@BeforeAll
public static void beforeAll()
{
System.out.println("Before all test");	
}

@AfterAll
public static void afterAll()
{
System.out.println("After all test");	
}

@BeforeEach
public void beforeEach()
{
System.err.println("Executed before each");	
}

@AfterEach
public void afterEach()
{
System.err.println("Executed after each");	
}

@Test
public void testOne()
{
System.out.println("This is my first test");	
}
	

@Test
public void testTwo()
{
System.out.println("This is my second test");	
}








}
