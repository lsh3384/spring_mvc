package com.example.demo;

import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {
	public List<HashMap<String, Object>> GetAllUsers();
}
