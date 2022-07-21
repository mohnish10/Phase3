package com.simplilearn.sportyshoes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.simplilearn.sportyshoes.entity.Shoes;
import com.simplilearn.sportyshoes.service.ShoeService;

@RestController
@RequestMapping("/api/shoes")
public class ShoeController {

@Autowired	
private ShoeService service;

@PostMapping("/")
public ResponseEntity<Object> addShoes(@RequestBody Shoes shoes)
{
Shoes data = service.addShoes(shoes);
if(data!=null)
return new ResponseEntity<Object>(data,HttpStatus.CREATED);
else	
return new ResponseEntity<Object>("Error while adding shoes",HttpStatus.INTERNAL_SERVER_ERROR);	
}


@GetMapping("/")
public List<Shoes> getAllShoes()
{
return service.getAllShoes();	
}


@GetMapping("/{id}")
public ResponseEntity<Object> getShoesById(@PathVariable int id)
{
if(service.getShoesById(id)!=null)
return new ResponseEntity<Object>(service.getShoesById(id),HttpStatus.FOUND);
else
return new ResponseEntity<Object>("Shoes not available at given id",HttpStatus.NOT_FOUND);	
}


@PutMapping("/{id}")
public ResponseEntity<Object> updateShoes(@RequestBody Shoes shoes, @PathVariable int id)
{
Shoes data = service.updateShoes(shoes,id);
if(data!=null)
return new ResponseEntity<Object>(data,HttpStatus.OK);
else
return new ResponseEntity<Object>("Shoe is not available for updating",HttpStatus.NOT_FOUND);	
}


@DeleteMapping("/{id}")
public ResponseEntity<Object> deleteShoes(@PathVariable int id)
{
if(service.deleteShoes(id))
return new ResponseEntity<Object>("Shoes deleted",HttpStatus.OK);
else
return new ResponseEntity<Object>("Shoe not found",HttpStatus.NOT_FOUND);	
}



}

 









