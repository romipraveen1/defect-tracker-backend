package com.sgic.library.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sgic.library.entities.Defect;
import com.sgic.library.entities.User;

public interface UserRepository extends JpaRepository<User,String>{

}
