package com.springboot.themplate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.springboot.themplate.model.User;
import com.springboot.themplate.service.IUser;

@Controller
public class userController {
	
	@Autowired
	@Qualifier("IUser")
	IUser URepo;
	
	@GetMapping({"/" , "home"})
	public String home(){
		return "home";	
			
		}
	
	
	@GetMapping("/loginForm")
	public String loginForm(){
	return "loginForm";	
	}
	
	@GetMapping("userview")
	ModelAndView userView() {
		List<User> lista = URepo.buscarTodo();
		ModelAndView mav = new ModelAndView("viewes/userViews/userViewe");
		
		mav.addObject("Users", lista);
		
		return mav;
	}
	
//	@GetMapping("/userForm")
//	public String userForm(){
//	return "viewes/userViews/userViewe";		
//	}
	
	@GetMapping("loginModal")
	public String loginModal(){
	return "loginModal";	
		
	}
	

	
}
