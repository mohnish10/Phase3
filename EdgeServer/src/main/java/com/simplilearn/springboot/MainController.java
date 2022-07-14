package com.simplilearn.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController 
{

@GetMapping("/hello")	
public String hello()
{
return "Welcome to Springboot App";
}

}
