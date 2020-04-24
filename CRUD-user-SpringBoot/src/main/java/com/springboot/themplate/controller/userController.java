package com.springboot.themplate.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class userController {
	
	@GetMapping({"/" , "home"})
	public String home(){
		return "home";	
			
		}
	
	
	@GetMapping("/loginForm")
	public String loginForm(){
	return "loginForm";	
	}
	
	
	@GetMapping("/userForm")
	public String userForm(){
	return "viewes/userViews/userViewe";		
	}
	
	@GetMapping("loginModal")
	public String loginModal(){
	return "loginModal";	
		
	}
	

	
}
