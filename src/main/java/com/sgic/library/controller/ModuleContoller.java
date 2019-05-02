package com.sgic.library.controller;

import java.util.List;

import javax.validation.Valid;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sgic.library.entities.Module;

import com.sgic.library.services.ModuleService;


@RestController
public class ModuleContoller {
	@Autowired
	ModuleService moduleservice;
	
	@CrossOrigin(origins = "http://localhost:3000")
	@PostMapping("/saveModule")
	public HttpStatus createModule(@Valid @RequestBody Module module) {
		moduleservice.saveModule(module);
		return HttpStatus.CREATED;
	}
	
	@CrossOrigin(origins = "http://localhost:3000")
	@GetMapping("/findmodule")
	public  List<Module> findallmain(Module module) {
	
		 List<Module> moduless = (List<Module>) moduleservice.findAll();
		 return moduless;
	        	
	}
	
	@CrossOrigin(origins = "http://localhost:3000")
	@GetMapping("/findmodule/{id}")
	public Module getMainById(@PathVariable("id") int id) {
		Module issueById=moduleservice.getModuleById(id);
		return issueById;	
	}
	
	@GetMapping("/findmoduledev/{id}")
	public Module getModuledevById(@PathVariable("id") int id) {
		Module issueById=moduleservice.getModuledevById(id);
		return issueById;	
	}

}
