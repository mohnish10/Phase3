package com.simplilearn.sportyshoes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplilearn.sportyshoes.entity.Shoes;
import com.simplilearn.sportyshoes.repo.ShoeRepo;

@Service
public class ShoeService {

@Autowired
private ShoeRepo repo;


public Shoes addShoes(Shoes shoes)
{
return repo.save(shoes);	
}


public List<Shoes> getAllShoes()
{
return repo.findAll();	
}


public Shoes getShoesById(int id)
{
if(repo.findById(id).isPresent())
return repo.findById(id).get();	
else
return null;	
}



public boolean deleteShoes(int id)
{
if(repo.findById(id).isPresent())
{	
repo.deleteById(id);	
return true;	
}
return false;
}


public Shoes updateShoes(Shoes shoes, int id)
{
if(repo.findById(id).isPresent())
{
Shoes old = repo.findById(id).get();
old.setColour(shoes.getColour());
old.setName(shoes.getName());
old.setPrice(shoes.getPrice());
old.setQuantity(shoes.getQuantity());
old.setSize(shoes.getSize());

return repo.save(old);
}
else
return null;	
}







}
