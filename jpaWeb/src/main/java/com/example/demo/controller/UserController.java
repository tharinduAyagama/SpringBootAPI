package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

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
	
	@RequestMapping("/showUsers")
	public ModelAndView getUsers() {
		ModelAndView mv = new ModelAndView();
		List<User> ul = (List<User>) ur.findAll();
		System.out.println(ul);
		mv.addObject("users" , ul);
		mv.setViewName("userList.jsp");
		return mv;
	}
}
