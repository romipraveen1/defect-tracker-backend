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

import com.sgic.library.entities.Defect;
import com.sgic.library.entities.User;
import com.sgic.library.services.DefectService;
import com.sgic.library.services.UserService;

@RestController
public class UserController {
	

	@Autowired
	UserService userservice;
	
	@CrossOrigin(origins = "http://localhost:3000")
	@PostMapping("/saveUser")
	public HttpStatus createUser(@Valid @RequestBody User user) {
		userservice.saveUser(user);
		return HttpStatus.CREATED;
	}
	
	@CrossOrigin(origins = "http://localhost:3000")
	@GetMapping("/findUser")
	public  List<User> findallUser(Defect defect) {
	
		 List<User> users = (List<User>) userservice.findAll();
		 return users;
	        	
	}
	

}
