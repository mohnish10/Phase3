package com.simplilearn.Event;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
public static void main(String[] args)
{
ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
context.start();
HelloWorld obj = (HelloWorld) context.getBean("obj");
obj.getMessage();
context.stop();
}
}
