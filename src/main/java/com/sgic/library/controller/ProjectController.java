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
import com.sgic.library.entities.Project;
import com.sgic.library.services.ProjectService;

@RestController
public class ProjectController {

	@Autowired
	ProjectService projectservice;
	
	@CrossOrigin(origins = "http://localhost:3000")
	@PostMapping("/saveProject")
	public HttpStatus createProject(@Valid @RequestBody Project project) {
		projectservice.saveProject(project);
		return HttpStatus.CREATED;
	}
	
	@CrossOrigin(origins = "http://localhost:3000")
	@GetMapping("/findProject")
	public  List<Project> findallmain(Project project) {
		 List<Project> moduless = (List<Project>) projectservice.findAll();
		 return moduless;
	        	
	}
	
//	@CrossOrigin(origins = "http://localhost:3000")
//	@GetMapping("/findProject/{projectId}")
//	public Project getProjectById(@PathVariable("projectId") int projectId) {
//		Project issueById=projectservice.getProjectById(projectId);
//		return issueById;	
//	}
}
