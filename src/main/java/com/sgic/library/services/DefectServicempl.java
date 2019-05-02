package com.sgic.library.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgic.library.entities.Defect;
import com.sgic.library.repositories.DefectRepository;

@Service
public class DefectServicempl implements DefectService {

	@Autowired
	DefectRepository defectrepository;

	public void saveDefect(Defect defect) {
		defectrepository.save(defect);
	}

	@Override
	public List<Defect> findAll() {

		List<Defect> defects = (List<Defect>) defectrepository.findAll();

		return defects;
	}

	@Override
	public Defect getDefectById(int id) {
		return defectrepository.findDefectById(id);
	}

	@Override
	public void deleteDefectById(int id) {
		Defect defect = defectrepository.findDefectById(id);
		defectrepository.delete(defect);

	}
	
	@Override
	
	public void updateDefect(Defect defect) {
		defectrepository.save(defect);
		
	}
}
