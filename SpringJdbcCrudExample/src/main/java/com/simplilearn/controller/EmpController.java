package com.simplilearn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.simplilearn.dao.EmpDao;
import com.simplilearn.springboot.Emp;

@Controller
public class EmpController 
{
@Autowired	
EmpDao dao;


@RequestMapping("/empform")
public String showForm(Model m)
{
m.addAttribute("command", new Emp());
return "empform";
}


@PostMapping("/save")
public String save(@ModelAttribute("emp")Emp emp)
{
dao.save(emp);	
return "redirect:/viewemp";
}

@RequestMapping("/viewemp")
public String viewemp(Model m)
{
List<Emp>list = dao.getEmployees();
m.addAttribute("list", list);	
return "viewemp";
}


@RequestMapping("editemp/{id}")
public String edit(@PathVariable int id, Model m)
{
Emp emp = dao.getEmpById(id);
m.addAttribute("command", emp);
return "empeditform";
}


@PostMapping("/editsave")
public String editsave(@ModelAttribute("emp") Emp emp)
{
dao.update(emp);
return "redirect:/viewemp";
}

@GetMapping("/deleteemp/{id}")
public String delete(@PathVariable int id)
{
dao.delete(id);
return "redirect:/viewemp";
}











}
