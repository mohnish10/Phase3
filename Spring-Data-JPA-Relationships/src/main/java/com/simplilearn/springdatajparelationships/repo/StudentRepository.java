package com.simplilearn.springdatajparelationships.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.simplilearn.springdatajparelationships.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {}