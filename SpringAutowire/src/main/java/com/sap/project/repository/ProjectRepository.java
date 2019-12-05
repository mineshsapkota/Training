package com.sap.project.repository;

import java.util.List;

import com.sap.project.model.Project;

public interface ProjectRepository {

	List<Project> findAll();

}