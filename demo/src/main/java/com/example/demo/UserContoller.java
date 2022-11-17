package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserContoller {
	
	@Autowired
	UserService userService;
	
	@RequestMapping("/users")
	public String users() {
		System.out.println("hello users");
		return "index";
	}
}