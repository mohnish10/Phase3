package com.simplilearn.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController 
{

@GetMapping("/")
public String welcome()
{
return "Response from Secure API";	
}




}
