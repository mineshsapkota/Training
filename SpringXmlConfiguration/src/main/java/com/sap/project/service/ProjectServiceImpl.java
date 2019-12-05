package com.sap.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.sap.project.model.Project;
import com.sap.project.repository.ProjectRepository;

@Service("projectService")
//@Scope("singleton")
public class ProjectServiceImpl implements ProjectService {
	
	@Autowired
	ProjectRepository projectRepo;
	
//	public ProjectServiceImpl() {
//		
//	}
//	
//	public ProjectServiceImpl(ProjectRepository projectRepo) {
//		
//		this.projectRepo = projectRepo;
//		
//	}
//	
//	public void setProjectRepo(ProjectRepository projectRepo) {
//		this.projectRepo = projectRepo;
//	}

	/* (non-Javadoc)
	 * @see com.sap.project.service.ProjectService#findAllProjects()
	 */
	@Override
	public List<Project> findAllProjects(){
		return projectRepo.findAll();
	}
	

}
