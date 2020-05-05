package com.springboot.themplate.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.themplate.model.User;

public interface IUserJPA extends JpaRepository<User, Integer> {

}
