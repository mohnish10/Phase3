package com.simplilearn.ConditionalTesting;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.JRE;

public class ConditionalJRETest 
{

@Test
@DisabledOnJre(JRE.JAVA_18)
public void runOnJRE18()
{
System.out.println("This case will run on JRE 18");
}

@Test
@DisabledOnJre(JRE.JAVA_17)
public void runOnJRE17()
{
System.out.println("This case will run on JRE 17");	
}

@Test
@DisabledOnJre(JRE.JAVA_16)
public void runOnJRE16()
{
System.out.println("This case will run on JRE 16");		
}

@Test
@DisabledOnJre(JRE.JAVA_15)
public void runOnJRE15()
{
System.out.println("This case will run on JRE 15");	
}


@Test
@DisabledOnJre(JRE.JAVA_14)
public void runOnJRE14()
{
System.out.println("This case will run on JRE 14");	
}


@Test
@DisabledOnJre(JRE.JAVA_13)
public void runOnJRE13()
{
System.out.println("This case will run on JRE 13");	
}


@Test
@DisabledOnJre(JRE.JAVA_12)
public void runOnJRE12()
{
System.out.println("This case will run on JRE 12");	
}


@Test
@EnabledOnJre(JRE.JAVA_11)
public void runOnJRE11()
{
System.out.println("This case will run on JRE 11");	
}






































}
