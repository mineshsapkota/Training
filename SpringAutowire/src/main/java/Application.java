import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sap.project.service.ProjectService;
import com.sap.project.service.ProjectServiceImpl;

public class Application {

	public static void main(String[] args) {
//		ProjectService service = new ProjectServiceImpl();
		
		ApplicationContext appContext = 
				new ClassPathXmlApplicationContext("applicationContext.xml"); 
		ProjectService service = appContext.getBean("service", ProjectService.class);
		
		
		System.out.println(service.findAllProjects().get(0).getName());

	}

}
