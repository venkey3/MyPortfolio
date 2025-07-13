package com.Venkatesh.MyPortfolio.service;

import org.springframework.stereotype.Service;

import com.Venkatesh.MyPortfolio.model.AboutMe;

@Service
public class AboutService {
	
	public AboutMe getaboutme() {
		
		return new AboutMe("Ponnapula Venkatesh",
	            "Java Developer | Spring Boot Enthusiast",
	            "I am a backend developer with 2.5 years of experience in building scalable Java-based applications using Spring Boot and Microservices architecture."
	        );
	}

}
