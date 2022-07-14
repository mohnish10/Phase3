package com.simplilearn.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemoApplication.class, args);
		System.out.println("Welcome to Spring boot");
		
		ConfigurableApplicationContext context = SpringApplication.run(SpringBootDemoApplication.class, args); 
		
		Student student = (Student) context.getBean("Student");
		
		student.show();
	    
		student.setCity("Pune");
	    student.setName("Mohnish Pawar");
	    student.setRollNo(25);
	    
	    System.out.println("Student details are as follows :"+ student.getCity() + " " +student.getName() + " " +student.getRollNo());
	    
        Marks marks = student.getMarks();
        

        
        
        
        marks.setBioMarks(75);
        marks.setChemMarks(85);
        marks.setPhyMarks(65);
		
		
        System.out.println("The Student's marks are as follows :"+ marks.getBioMarks() + " " + marks.getChemMarks() + " " + marks.getPhyMarks());
        marks.calculate();
        
        
	}

}
