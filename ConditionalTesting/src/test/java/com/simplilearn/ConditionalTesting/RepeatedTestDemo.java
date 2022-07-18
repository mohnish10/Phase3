package com.simplilearn.ConditionalTesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

class RepeatedTestDemo {

	@BeforeAll
	static void setUpBeforeClass() throws Exception 
	{
	System.out.println("setup before all");
	
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	System.out.println("teardown after all");
	}

	@BeforeEach
	void setUp() throws Exception {
	System.out.println("Setup before each");	
	}

	@AfterEach
	void tearDown() throws Exception {
	System.out.println("teardown after each");
	}
	
	
	@DisplayName("Repeated Test")
	@RepeatedTest(value=5,name="Testcase:{displayName} the current count is"+"{currentRepetition} out of {totalRepetitions}")
	void test()
	{
	assertEquals(6,4+2);
	System.out.println("Test Executed");
	}
	
	
	



}
