package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CusromerProfile {
	@RequestMapping("/profile")
	public String greet() {
		return "profile";
	}
}
