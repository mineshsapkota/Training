package com.sap.project.service;

import java.util.List;

import com.sap.project.model.Project;
import com.sap.project.repository.ProjectRepository;

public class ProjectServiceImpl implements ProjectService {
	
	ProjectRepository projectRepo;
	
	public ProjectServiceImpl() {
		
	}
	
	public ProjectServiceImpl(ProjectRepository projectRepo) {
		
		this.projectRepo = projectRepo;
		
	}
	
	public void setProjectRepo(ProjectRepository projectRepo) {
		this.projectRepo = projectRepo;
	}

	/* (non-Javadoc)
	 * @see com.sap.project.service.ProjectService#findAllProjects()
	 */
	@Override
	public List<Project> findAllProjects(){
		return projectRepo.findAll();
	}
	

}
