package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BookController {
	//http:localhost:8080/siri?Java=Employee

	@GetMapping("/siri")
	public ModelAndView getBookName(@RequestParam String Java) {
		ModelAndView mav=new ModelAndView();
		String msgTxt=Java +"Welcome to Shireesha into SoftwareFeild";
		mav.addObject("msg", msgTxt);
		mav.setViewName("siriindex");
		return mav;

}
	@GetMapping("/book")
	public ModelAndView getBookAuthor(@RequestParam String name,String author) {
		ModelAndView mav=new ModelAndView();
		mav.addObject("msg", name + " bys " + author +" not available ") ;
		mav.setViewName("siriindex");
		return mav;

	
}
}
