package com.simplilearn.JunitTestingDemo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest 
{

private Calculator calc;

@BeforeEach
public void setup()
{
calc = new Calculator();	
}

@AfterEach
public void teardown()
{
calc=null;	
}

@Test
public void addtest()
{
assertEquals(7,calc.add(3,4));	
}

@Test
public void subtest()
{
assertEquals(6,calc.sub(12,6));	
}








}
