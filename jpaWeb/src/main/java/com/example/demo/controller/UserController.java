package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.User;
import com.example.demo.repo.UserRepo;

@Controller
public class UserController {
	
	@Autowired
	UserRepo ur;
	
	@RequestMapping("/user")
	public String user() {
		return "user.jsp";
	}
	
	@RequestMapping("/addUser")
	public String add(User u) {
		ur.save(u);
		return "user.jsp";
	}
}
