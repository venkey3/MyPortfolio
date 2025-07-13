package com.Venkatesh.MyPortfolio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.Venkatesh.MyPortfolio.model.Projects;
import com.Venkatesh.MyPortfolio.service.ProjectService;

@Controller
public class ProjectController {
	
	@Autowired
	public ProjectService projectservice;
	
	@GetMapping("/projects")
	 public String getProjects(Model model) {
	 List<Projects> projects= projectservice.getAllProjects();
	 model.addAttribute("projects", projects);
     return "projects";
	}

}
