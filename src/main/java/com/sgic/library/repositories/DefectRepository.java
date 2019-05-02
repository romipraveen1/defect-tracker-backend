package com.sgic.library.repositories;

import org.springframework.data.jpa.repository.JpaRepository;


import com.sgic.library.entities.Defect;

public interface DefectRepository extends JpaRepository<Defect,String> {
	//void saveDefect(Defect defect);
	Defect findDefectById(int id);

	//Defect deleteDefectById(int id);

}
