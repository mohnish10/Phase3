package com.simplilearn.sportyshoes.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.simplilearn.sportyshoes.entity.Shoes;

public interface ShoeRepo extends JpaRepository<Shoes,Integer>{

}
