package com.sgic.library.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgic.library.entities.Module;
import com.sgic.library.entities.Project;
import com.sgic.library.repositories.ProjectRepository;

@Service
public class ProjectServicempl implements ProjectService{
	
	@Autowired
	ProjectRepository projectrepository ;
	
	public void saveProject(Project project) {
		projectrepository.save(project);
	}
	
	@Override
    public List<Project> findAll() {

        List<Project> main = (List<Project>) projectrepository.findAll();
        
        return main;
    }
	
//	@Override
//	public Project getProjectById(int projectId) {
//		return projectrepository.findProjectById(projectId);
//	}
	

}
