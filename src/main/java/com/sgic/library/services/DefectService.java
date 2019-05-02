package com.sgic.library.services;


import java.util.List;

import com.sgic.library.entities.Defect;

public interface DefectService {
	void saveDefect(Defect defect );
	
	public List<Defect> findAll();
	Defect getDefectById(int id);
	public void deleteDefectById(int id);
	void updateDefect(Defect defect);
}
