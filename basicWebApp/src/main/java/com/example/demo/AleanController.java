package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AleanController {
	@RequestMapping("alean")
	public ModelAndView gree(Alean a) {
		System.out.println("cjjdk");
		ModelAndView mv = new ModelAndView();
		mv.addObject("obj" , a);
		mv.setViewName("alean");
		return mv;
	}
}
