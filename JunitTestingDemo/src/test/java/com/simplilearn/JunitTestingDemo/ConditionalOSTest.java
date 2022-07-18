package com.simplilearn.JunitTestingDemo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledOnOs;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

public class ConditionalOSTest 
{

@Test
@EnabledOnOs({OS.WINDOWS})
public void runOnWindows()
{
System.out.println("This runs on Windows OS");	
}

@Test
@DisabledOnOs({OS.MAC})
public void notRunOnMac()
{
System.out.println("Not run on MAC");	
}

@Test
@EnabledOnOs({OS.MAC})
public void runOnMac()
{
System.out.println("This runs on Mac OS");	
}

@Test
@EnabledOnOs({OS.LINUX})
public void runOnLinux()
{
System.out.println("This runs on Linux OS");	
}
	








}
