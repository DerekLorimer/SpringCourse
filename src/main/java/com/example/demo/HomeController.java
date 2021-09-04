package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@Autowired
	PersonRepo repo;

	@RequestMapping("home")
	public ModelAndView home(@RequestParam("name") String name) {

		ModelAndView mv = new ModelAndView();

		System.out.println("hello ModelAndView   " + name);

		mv.addObject("name", name);
		mv.setViewName("home");

		return mv;

	}

	@RequestMapping("addPerson")
	public ModelAndView addPerson(Person person) {

		ModelAndView mv = new ModelAndView();

		mv.setViewName("home");
		
		repo.save(person);

		return mv;

	}

}
