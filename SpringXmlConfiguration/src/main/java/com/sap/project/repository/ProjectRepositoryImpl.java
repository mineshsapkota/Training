package com.sap.project.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.sap.project.model.Project;

@Repository("projectRepo")
public class ProjectRepositoryImpl implements ProjectRepository {

	/* (non-Javadoc)
	 * @see com.sap.project.repository.ProjectRepository#findAll()
	 */
	@Override
	public List<Project> findAll() {

		List<Project> projects = new ArrayList<Project>();

		Project project = new Project();

		project.setID(1);
		project.setName("Training Project");
		
		projects.add(project);

		return projects;

	}

}
