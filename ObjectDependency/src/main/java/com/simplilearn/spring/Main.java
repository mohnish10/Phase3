package com.simplilearn.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
public static void main(String[] args)
{
ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
Student student = (Student) context.getBean("Student");
student.cheating();
}
	

}
