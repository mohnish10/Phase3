package com.simplilearn.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class App 
{
    public static void main( String[] args )
    {
    //Resource resource = new ClassPathResource("bean.xml");
    //BeanFactory factory = new XmlBeanFactory(resource);
    ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
    Student student = (Student) context.getBean("s1");
    System.out.println(student.getId() + " The name of student is " +student.getName());
    

    
    
    }
}
