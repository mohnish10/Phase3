package com.simplilearn.springdatajparelationships.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.simplilearn.springdatajparelationships.entity.Teacher;
import com.simplilearn.springdatajparelationships.repo.TeacherRepository;

import java.util.List;

@RestController
@RequestMapping("/teachers")
public class TeacherController {

    @Autowired
    TeacherRepository teacherRepository;

    @GetMapping
    List<Teacher> getTeachers() {
        return teacherRepository.findAll();
    }

    @PostMapping
    Teacher createTeacher(@RequestBody Teacher teacher) {
        return teacherRepository.save(teacher);
    }
}
