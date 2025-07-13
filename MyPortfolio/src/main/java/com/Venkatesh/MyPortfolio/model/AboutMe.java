package com.Venkatesh.MyPortfolio.model;

public class AboutMe {
	
	public String fullname;
	public String title;
	public String summary;
	
	public AboutMe(String fullname, String title, String summary) {
		super();
		this.fullname = fullname;
		this.title = title;
		this.summary = summary;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	

}
