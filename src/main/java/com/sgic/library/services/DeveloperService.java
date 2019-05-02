package com.sgic.library.services;

import java.util.List;

import com.sgic.library.entities.Developer;

public interface DeveloperService {
	
void saveDeveloper(Developer developer);
	
	public List<Developer> findAll();

}
