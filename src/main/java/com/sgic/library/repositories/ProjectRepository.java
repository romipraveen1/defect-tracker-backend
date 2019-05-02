package com.sgic.library.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sgic.library.entities.Module;
import com.sgic.library.entities.Project;

public interface ProjectRepository extends JpaRepository<Project,Integer>{
	
//	Project findProjectById(int projectId);
}
