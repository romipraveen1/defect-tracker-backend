package com.sgic.library.services;


import java.util.List;

import com.sgic.library.entities.Module;

public interface ModuleService {
	void saveModule(Module module);
	public List<Module> findAll();
	Module getModuleById(int id);
	Module getModuledevById(int id);

}
