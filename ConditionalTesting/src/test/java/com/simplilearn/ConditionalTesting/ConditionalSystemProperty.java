package com.simplilearn.ConditionalTesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.DisabledIfSystemProperty;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.EnabledIfSystemProperty;

class ConditionalSystemProperty 
{

@Test
@EnabledIfSystemProperty(named="os.version",matches=".*10.*")
public void runOnWindows10()
{
System.out.println("This case will execute on Windows 10 only");	
}


@Test
@DisabledIfSystemProperty(named="os.version",matches="10")
public void runOnWindows1()
{
System.out.println("This case will execute on Windows 10 only");	
}


@Test
@DisabledIfEnvironmentVariable(named="ENV",matches=".*development.*")
public void executeOnlyInDevEnv()
{
System.out.println("Run in development environment");	
}
	

@Test
@DisabledIfEnvironmentVariable(named="ENV",matches=".*prod.*")
public void executeOnlyInProdEnv()
{
System.out.println("Run in production environment");	
}







}
