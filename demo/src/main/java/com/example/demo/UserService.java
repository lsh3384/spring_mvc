package com.example.demo;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("UserService")
public class UserService {
	
	@Autowired
	UserDao dao;
	
	public List<HashMap<String, Object>> GetAllUsers() {
		return dao.GetAllUsers();
	}
	
}
