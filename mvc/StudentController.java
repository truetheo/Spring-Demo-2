package com.a.springdemo.mvc;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	@Value("#{countryOptionsFile}")
	private Map<String, String> countryOptionsFile;
	
	@RequestMapping("/showForm")
	public String showForm(Model theModel) {
		
		// create a new Student Object
		Student theStudent = new Student();
		
		//add that Student object to the model
		theModel.addAttribute("student", theStudent);
		
		// add the country options to the model
		theModel.addAttribute("theCountryOptions", countryOptionsFile);
		
		return "student-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student") Student theStudent) {
		//check out if the data is processed
		System.out.println("theStudent: " + theStudent.getFirstName() +
				" " + theStudent.getLastName());
		
		return "student-confirmation";
	}
}
