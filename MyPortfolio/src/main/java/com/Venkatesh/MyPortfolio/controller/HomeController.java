package com.Venkatesh.MyPortfolio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.Venkatesh.MyPortfolio.model.AboutMe;
import com.Venkatesh.MyPortfolio.service.AboutService;

@Controller
public class HomeController {
	
	@Autowired
    private AboutService aboutService;
	
	 @GetMapping("/")
	    public String home(Model model) {
	        model.addAttribute("name", "Ponnapula Venkatesh");
	        model.addAttribute("title", "Java Developer | Spring Boot Enthusiast");
	        return "home";  // home.html will be rendered
	    }
	
	@GetMapping("/about")
	public AboutMe about() {
		return aboutService.getaboutme();
	}

}
