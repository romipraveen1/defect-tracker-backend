package com.sgic.library.repositories;

import org.springframework.data.jpa.repository.JpaRepository;


import com.sgic.library.entities.Module;


public interface ModuleRepositories extends JpaRepository<Module,Integer>{
	//void saveModule(Module module);
//	<module find<moduleById(int id);
	
	Module findModuleById(int id);
	
	Module findModuledevById(int id);


}
