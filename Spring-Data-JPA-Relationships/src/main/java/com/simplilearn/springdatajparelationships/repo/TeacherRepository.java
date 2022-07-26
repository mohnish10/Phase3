package com.simplilearn.springdatajparelationships.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.simplilearn.springdatajparelationships.entity.Teacher;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Long> {}