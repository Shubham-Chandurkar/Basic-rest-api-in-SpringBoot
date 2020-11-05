package com.example.demo;

public class ProjectSubData {

	String proj_name;
	String proj_desc;
	
	
	public ProjectSubData(String proj_name, String proj_desc) {
		super();
		this.proj_name = proj_name;
		this.proj_desc = proj_desc;
	}
	public String getProj_name() {
		return proj_name;
	}
	public void setProj_name(String proj_name) {
		this.proj_name = proj_name;
	}
	public String getProj_desc() {
		return proj_desc;
	}
	public void setProj_desc(String proj_desc) {
		this.proj_desc = proj_desc;
	}
	
	
}
