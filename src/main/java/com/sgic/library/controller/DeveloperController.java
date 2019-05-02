package com.sgic.library.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sgic.library.entities.Developer;

import com.sgic.library.services.DeveloperService;


@RestController
public class DeveloperController {


	@Autowired
	DeveloperService developerService;
	
	@CrossOrigin(origins = "http://localhost:3000")
	@PostMapping("/saveDeveloper")
	public HttpStatus createDeveloper(@Valid @RequestBody Developer developer) {
		developerService.saveDeveloper(developer);
		return HttpStatus.CREATED;
	}
	
	@CrossOrigin(origins = "http://localhost:3000")
	@GetMapping("/finddeveloper")
	public  List<Developer> findallmain(Developer developer) {
	
		 List<Developer> books = (List<Developer>) developerService.findAll();
		 return books;
	        	
	}
}
