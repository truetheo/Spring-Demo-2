package com.a.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {
	
	// need a controller method to show the initial HTML form
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	// need a controller method to process the HTML form
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	
	// new a controller method to read form data and
	
	// add data to the model
	@RequestMapping("/processFormVersion2")
	public String letsShoutDude(HttpServletRequest request, Model model) {
		
		// read the request parameter form HTML form
		String theName = request.getParameter("studentName");
		//convert to all upper case
		theName = theName.toUpperCase();
		//create the message
		String result = "Yo! " + theName;
		//add the message to the model
		model.addAttribute("message", result);
		
		//return the jsp
		return "helloworld";
	}
	// add data to the model three
		@RequestMapping("/processFormVersionThree")
		public String proccessFormVersionThree(
				@RequestParam("studentName") String theName,
				Model model) {
			
			//convert to all upper case
			theName = theName.toUpperCase();
			//create the message
			String result = "Hey Bro from Form v3! " + theName;
			//add the message to the model
			model.addAttribute("message", result);
			
			//return the jsp
			return "helloworld";
		}
}
