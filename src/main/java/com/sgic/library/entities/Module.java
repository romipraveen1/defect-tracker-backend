package com.sgic.library.entities;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;



@Entity
@Table(schema="book",name="module")
//@NamedQuery(name = "module.getModuledevById", 
//query = "SELECT developer FROM developer WHERE id ='id'")

public class Module {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String moduleName;
	

	@ManyToOne
	@JoinColumn(name="projectId",nullable=false)
	@JsonProperty(access = Access.WRITE_ONLY)
	private Project project;
	

	//@JsonIgnore
@OneToMany(mappedBy="module",cascade = {CascadeType.ALL})
private List<Developer> developer;


	


	public Project getProject() {
	return project;
}
public void setProject(Project project) {
	this.project = project;
}
	public List<Developer> getDeveloper() {
	return developer;
}
public void setDeveloper(List<Developer> developer) {
	this.developer = developer;
}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getModuleName() {
		return moduleName;
	}
	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}

//	@OneToMany(mappedBy="mainClassification",cascade = {CascadeType.ALL})
	
//	private List<SubClassification> subClassification;
	

}
