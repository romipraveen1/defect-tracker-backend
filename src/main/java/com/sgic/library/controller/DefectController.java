package com.sgic.library.controller;

import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.sgic.library.entities.Defect;
import com.sgic.library.services.DefectService;


@RestController
public class DefectController {
	
	
	@Autowired
	DefectService defectservice;
	
	@CrossOrigin(origins = "http://localhost:3000")
	@PostMapping("/saveDefect")
	public HttpStatus createBook(@Valid @RequestBody Defect defect) {
		defectservice.saveDefect(defect);
		return HttpStatus.CREATED;
	}
	
	@CrossOrigin(origins = "http://localhost:3000")
	@GetMapping("/findDefect")
	public  List<Defect> findallBook(Defect defect) {
	
		 List<Defect> defects = (List<Defect>) defectservice.findAll();
		 return defects;
	        	
	}
	
	@CrossOrigin(origins = "http://localhost:3000")
	@GetMapping("/findid/{id}")
  public Defect getDefectById (@PathVariable( "id") int id) {
      
		Defect book = defectservice.getDefectById(id);
      return book;
  }
	
	@CrossOrigin(origins = "http://localhost:3000")
	@DeleteMapping("/delete/{id}")
	public void deleteDefectById(@PathVariable("id") int id) {
		defectservice.deleteDefectById(id);
		
	}
	@CrossOrigin(origins = "http://localhost:3000")
	 @PutMapping("/defect/{id}")
	   public ResponseEntity<Defect> updateDefect(@Valid @RequestBody Defect defect) {
	       
		 defectservice.updateDefect(defect);
	        return new ResponseEntity<Defect>(defect ,HttpStatus.NO_CONTENT);
	    }


}
