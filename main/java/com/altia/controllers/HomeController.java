package com.altia.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String home() {
		
		return "home";
	}
	
	@PostMapping("/form")
	public ModelAndView getFormData(@ModelAttribute("comment") final String data) {
		
		ModelAndView mav = new ModelAndView( "home");
		
		mav.addObject( "result", data);
		
		return mav;
	}
	

}
