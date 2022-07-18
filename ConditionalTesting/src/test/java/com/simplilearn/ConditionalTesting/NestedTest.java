package com.simplilearn.ConditionalTesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class NestedTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	System.out.println("Before All from outer Class");	
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	System.out.println("After All from outer class");	
	}

	@BeforeEach
	void setUp() throws Exception {
	System.out.println("Before Each from outer class");	
	}

	@AfterEach
	void tearDown() throws Exception {
	System.out.println("After Each from outer class");	
	}

	@Test
	@DisplayName("Outer test")
	void testOuter()
	{
	System.out.println("Test case from Outer class");	
	}
	
	@Nested	
	class Inner
	{
	@BeforeEach
	void setUp() throws Exception
	{
	System.out.println("Before Each from inner class");	
	}
	
	@AfterEach
	void tearDown() throws Exception
	{
	System.out.println("After Each from inner class");	
	}
	
	
	@Test
	@DisplayName("Inner Test")
	void testInner()
	{
	System.out.println("Test case from inner class");	
	}
	
	@Nested
	class Whenx
	{
	@BeforeEach
	void setUp() throws Exception
	{
	System.out.println("Before Each from whenx class");	
	}
	
	
	@AfterEach
	void tearDown() throws Exception{
		System.out.println("After Each From WhenX class");
	}
	
	
	
	@Test
	@DisplayName("WhenX Test")
	void testInner() {
		System.out.println("Test case from WhenX class");
	}
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
