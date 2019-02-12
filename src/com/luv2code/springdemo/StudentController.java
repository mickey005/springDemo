package com.luv2code.springdemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("student")
public class StudentController {

	@RequestMapping("/showStudent")
	public String showStudent(Model theModel) {
		
	 Student theStudent = new Student();
	 
	 theModel.addAttribute("student",theStudent);
		return "show-student";
	}
	
	@RequestMapping("studentDetails")
	public String studentDetails(@ModelAttribute("student") Student theStudent)
	{
		System.out.println("student"+ theStudent.getFirstName());
		return "student-details";
	}
	
}
