package com.sgic.library.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sgic.library.entities.Module;
import com.sgic.library.entities.Project;

@Service
public interface ProjectService {
	void saveProject(Project project);
	public List<Project> findAll();
//	Project getProjectById(int projectId);

}
