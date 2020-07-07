package com.example.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/home")
	public String hi(HttpServletRequest req) {
		HttpSession ses = req.getSession();
		String name = req.getParameter("name");
		ses.setAttribute("n", name);
		System.out.println("hi " + name);
		return "home";
	}
}
