package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ProjectService {
	
	private List<ProjectData> projects = new ArrayList<>(Arrays.asList());
	
	public List<ProjectData> getAllProjects() {
		return projects;
	}

	public void addProject(ProjectData project) {
		projects.add(project); 	
	}
}
