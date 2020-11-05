package com.example.demo;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;

import come.example.output.OutData;
import come.example.output.OutError;
import come.example.output.OutJson;
import come.example.output.OutStatus;

@RestController
public class ProjectController {

	Logger logger = LogManager.getLogger(ProjectController.class);
	
	@Autowired
	private ProjectService projectService;

	@RequestMapping("/projects")
	public List<ProjectData> getProjects() {
		logger.info("Successfully execute GetProject method");
		return projectService.getAllProjects();
	}

	@RequestMapping(method = RequestMethod.POST, value = "/v1/proj")
	public OutJson addProject(@RequestBody ProjectData<ProjectSubData> project) {
		long startTime = System.nanoTime();
		projectService.addProject(project);
		long endTime = System.nanoTime();
		long duration= endTime -startTime;
		
		String idVar = project.getReqid();
		idVar = idVar.replace("ui", "api-serv1");
		
		OutData data = new OutData("Data saved successfuly");
		OutError error = new OutError("Error msg if any");
		OutStatus stats = new OutStatus(duration);
		
		OutJson out = new OutJson(idVar,"OK",data,error,stats);
		
		Gson json = new Gson();
		json.toJson(out);
		
		logger.info("Successfully execute AddProject method");
		
		return out;
		
		
		
	}

}
