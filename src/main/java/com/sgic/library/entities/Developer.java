package com.sgic.library.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;



@Entity
@Table(schema="book",name="developer")

public class Developer {
	
	
	
	
		
		@Id
		//@GeneratedValue(strategy=GenerationType.IDENTITY)
		private long developerId;
		private String developerName;
		
		
		@ManyToOne
		@JoinColumn(name="id",nullable=false)
		//@JsonIgnore
		@JsonProperty(access = Access.WRITE_ONLY)
		private Module module;


		

		public long getDeveloperId() {
			return developerId;
		}


		public void setDeveloperId(long developerId) {
			this.developerId = developerId;
		}


		public String getDeveloperName() {
			return developerName;
		}


		public void setDeveloperName(String developerName) {
			this.developerName = developerName;
		}


		public Module getModule() {
			return module;
		}


		public void setModule(Module module) {
			this.module = module;
		}
		

}
