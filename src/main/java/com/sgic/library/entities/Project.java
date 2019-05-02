package com.sgic.library.entities;



import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(schema="book",name="project")
public class Project {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int projectId;
	private String projectName;
	
	@OneToMany(mappedBy="project",cascade = {CascadeType.ALL})
	private List<Module> module;

	public int getProjectId() {
		return projectId;
	}




	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}




	public String getProjectName() {
		return projectName;
	}




	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}




	public List<Module> getModule() {
		return module;
	}




	public void setModule(List<Module> module) {
		this.module = module;
	}







	
	
}
