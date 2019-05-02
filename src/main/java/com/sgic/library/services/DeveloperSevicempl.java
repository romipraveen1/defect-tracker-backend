package com.sgic.library.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgic.library.entities.Developer;

import com.sgic.library.repositories.DeveloperRepository;


@Service
public class DeveloperSevicempl implements DeveloperService{
	
	@Autowired
	DeveloperRepository developerrepository ;
	
	public void saveDeveloper(Developer developer) {
		developerrepository.save(developer);
	}
	
	@Override
    public List<Developer> findAll() {

        List<Developer> main = (List<Developer>) developerrepository.findAll();
        
        return main;
    }

}
