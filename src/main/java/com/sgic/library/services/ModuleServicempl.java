package com.sgic.library.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.sgic.library.entities.Module;

import com.sgic.library.repositories.ModuleRepositories;


@Service
public class ModuleServicempl implements ModuleService{
	
	@Autowired
	ModuleRepositories modulerepositories ;
	
	public void saveModule(Module module) {
		modulerepositories.save(module);
	}
	
	@Override
    public List<Module> findAll() {

        List<Module> main = (List<Module>) modulerepositories.findAll();
        
        return main;
    }
	
	@Override
	public Module getModuleById(int id) {
		return modulerepositories.findModuleById(id);
	}
	
	@Override
	public Module getModuledevById(int id) {
		return modulerepositories.findModuledevById(id);
	}

}
