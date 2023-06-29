package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ModelController {
	
	@GetMapping("/wel")
	public ModelAndView getWelcomeMsg(@RequestParam String name) {
		ModelAndView mav=new ModelAndView();
		String msgTxt=name +" Welcome to Shireesha into SoftwareFeild";
		mav.addObject("msg", msgTxt);
		mav.setViewName("siriindex");
		return mav;
	
	
	}
	
	@GetMapping("/greet")
	public String getWelcomeMsg(@RequestParam String name, Model model) {
		
		model.addAttribute("msg", name + " Good Evening");
		return "siriindex";

	}	
}
