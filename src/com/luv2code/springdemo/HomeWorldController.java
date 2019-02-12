package com.luv2code.springdemo;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeWorldController {

	@RequestMapping("/showForm")
	public String showPage() {
		
		return "helloword-form";
	}
	
	
	@RequestMapping("/processForm")
	public String processForm() {
		
		return "helloworld";
	}
	
	
	@RequestMapping("/processFormUpperCase")
	public String  letsShoutDude(HttpServletRequest request,Model model) {

		String name = request.getParameter("studentName");
		
		name = name.toUpperCase();
		
		String result = "YO!" + name;
		
		model.addAttribute("message",result);
	
		return "helloworld";
	}
	
	@RequestMapping("/processFormUpperCaseThree")
	public String  processFormUpperCaseThree(@RequestParam("studentName") String name,Model model) {

		//String name = request.getParameter("studentName");
		
		name = name.toUpperCase();
		
		String result = "YOYO!" + name;
		
		model.addAttribute("message",result);
	
		return "helloworld";
	}
}
