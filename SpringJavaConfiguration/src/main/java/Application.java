import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sap.project.service.ProjectService;
import com.sap.project.service.ProjectServiceImpl;

public class Application {

	public static void main(String[] args) {
//		ProjectService service = new ProjectServiceImpl();

//		ApplicationContext appContext = 
//				new ClassPathXmlApplicationContext("applicationContext.xml"); 

		ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);

		ProjectService service = appContext.getBean("service", ProjectService.class);

		System.out.println("Address 1" + service);

		System.out.println(service.findAllProjects().get(0).getName());
		
		ProjectService service1 = appContext.getBean("service", ProjectService.class);

		

		System.out.println("Address 2" + service1);
		

	}

}
