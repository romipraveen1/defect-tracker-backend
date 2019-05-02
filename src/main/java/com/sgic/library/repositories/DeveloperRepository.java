package com.sgic.library.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sgic.library.entities.Developer;



public interface DeveloperRepository extends JpaRepository<Developer,String>{

}
