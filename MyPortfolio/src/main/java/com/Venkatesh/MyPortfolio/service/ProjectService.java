package com.Venkatesh.MyPortfolio.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.Venkatesh.MyPortfolio.model.Projects;

@Service
public class ProjectService {
	

	    public List<Projects> getAllProjects() {
	        return List.of(
	            new Projects(
	                "ToDo App",
	                "Simple task management system with CRUD functionality.",
	                "Spring Boot, Thymeleaf, MySQL",
	                "https://github.com/venkatesh/todo-app"
	            ),
	            new Projects(
	                "E-Commerce Site",
	                "Online shopping platform with product catalog and checkout flow.",
	                "Spring Boot, REST API, Bootstrap, MySQL",
	                "https://github.com/venkatesh/ecommerce-site"
	            )
	        );
}
}
