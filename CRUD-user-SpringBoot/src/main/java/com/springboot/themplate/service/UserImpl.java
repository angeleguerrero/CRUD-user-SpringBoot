package com.springboot.themplate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.themplate.model.User;
import com.springboot.themplate.repository.IUserJPA;

@Service("IUser")
public class UserImpl implements IUser {

	@Autowired
	IUserJPA userRepo;
	
	
	@Override
	public List<User> buscarTodo() {
	List<User> lista = userRepo.findAll();
		return lista;
	}

}
