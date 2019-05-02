package com.sgic.library.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgic.library.entities.Defect;
import com.sgic.library.entities.User;
import com.sgic.library.repositories.DefectRepository;
import com.sgic.library.repositories.UserRepository;


@Service
public class UserServicempl implements UserService{
	
	@Autowired
	UserRepository userrepository;

	public void saveUser(User user) {
		userrepository.save(user);
	}
	
	@Override
	public List<User> findAll() {

		List<User> users = (List<User>) userrepository.findAll();

		return users;
	}


}
