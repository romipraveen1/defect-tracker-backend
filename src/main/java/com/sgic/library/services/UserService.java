package com.sgic.library.services;

import java.util.List;

import com.sgic.library.entities.Defect;
import com.sgic.library.entities.User;

public interface UserService {
	void saveUser(User user );
	
	public List<User> findAll();

}
