package com.example.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("home")
	public String home(HttpServletRequest req) {
		
		String name = req.getParameter("name");
		
		
		System.out.println("hello   " + name);
		
		HttpSession session = req.getSession();
		
		session.setAttribute("name", name);
		
		return "home";
		
	}

}
