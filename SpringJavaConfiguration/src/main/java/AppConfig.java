import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sap.project.repository.ProjectRepository;
import com.sap.project.repository.ProjectRepositoryImpl;
import com.sap.project.service.ProjectService;
import com.sap.project.service.ProjectServiceImpl;

@Configuration
public class AppConfig {
	
	@Bean(name ="service")
	public ProjectService getCustomerService() {
		ProjectServiceImpl service = new ProjectServiceImpl();
		service.setProjectRepo(getProjectRepository());
		return service;
	}
	
	@Bean(name="projectRepo")
	public ProjectRepository getProjectRepository() {
		return new ProjectRepositoryImpl();
	}

}
