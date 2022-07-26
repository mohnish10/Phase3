package com.simplilearn.springdatajparelationships.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.simplilearn.springdatajparelationships.entity.Subject;

@Repository
public interface SubjectRepository extends JpaRepository<Subject, Long> {}