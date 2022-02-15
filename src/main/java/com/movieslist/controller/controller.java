package com.movieslist.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.movieslist.Service.Movies_service;
import com.movieslist.model.Movies;

@Controller
@RequestMapping("/")
public class controller {

	@Autowired
	private Movies_service repos;
	
	@PostMapping("/add")
	ResponseEntity<Movies> adddetails(@RequestBody Movies movies){
	Movies adding = repos.adddetails(movies);
	return new ResponseEntity<Movies>(adding, HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/get")
	ResponseEntity<List<Movies>> getdetails(){
	List<Movies> getting = repos.getdetails();
	return new ResponseEntity<List<Movies>>(getting,HttpStatus.OK);
	}
	
	@GetMapping("/get/{id}")
	ResponseEntity<Movies> getbyid(@PathVariable("id") int getI ){
	Movies gettingbyid = repos.getbyid(getI);
	return new ResponseEntity<Movies>(gettingbyid,HttpStatus.FOUND);
	}
	
	@DeleteMapping("/delete/{id}")
	ResponseEntity<Void> deletebyid(@PathVariable("id") int getL){
	repos.deletebyid(getL);
	return new ResponseEntity<Void>(HttpStatus.ACCEPTED);
	}
}
