package com.Venkatesh.MyPortfolio.model;



public class Projects {
	
	private String name;
    private String description;
    private String techStack;
    private String projectUrl;
	public String getName() {
		return name;
	}
	public String getDescription() {
		return description;
	}
	public String getTechStack() {
		return techStack;
	}
	public String getProjectUrl() {
		return projectUrl;
	}
	public Projects(String name, String description, String techStack, String projectUrl) {
		super();
		this.name = name;
		this.description = description;
		this.techStack = techStack;
		this.projectUrl = projectUrl;
	}
		

}
