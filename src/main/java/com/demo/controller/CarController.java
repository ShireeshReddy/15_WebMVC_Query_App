package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class CarController {
	
	@GetMapping("/kushvith/{rank}/za")
	public ModelAndView getFoodName(@PathVariable Integer rank) {
		ModelAndView mav=new ModelAndView();
		String food=null;
		if (rank>100) {
			food="milk";
		}
		else {
			food="uggu";
		}
		mav.addObject("msg", "kushvith food is :"+food);
		mav.setViewName("siriindex");
		return mav;

}
	@GetMapping("/Son/{name}/location/{loca}")
	public ModelAndView getLocationName(@PathVariable String name, @PathVariable String loca) {
		ModelAndView mav=new ModelAndView();
		mav.addObject("msg", "In " + loca + " " + name + " cars Out Of Stock");

		//mav.addObject("msg", "yes" + loca +" baby " + name +" in the South Africa ");
		mav.setViewName("siriindex");
		return mav;
	}
	
	@GetMapping("/stock/{brand}/location/{loc}")
	public ModelAndView getCarStock(@PathVariable String brand, @PathVariable String loc) {

		ModelAndView mav = new ModelAndView();

		mav.addObject("msg", "In " + loc + " " + brand + " cars Out Of Stock");

		mav.setViewName("siriindex");
		return mav;
	}
}
