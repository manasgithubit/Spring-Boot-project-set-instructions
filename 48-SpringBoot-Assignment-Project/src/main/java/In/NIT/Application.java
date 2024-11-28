package In.NIT;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import In.NIT.Entity.Patient;
import In.NIT.Service.UserService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) 
	{
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		System.out.println("Application started successfully!");
		Runtime.getRuntime().addShutdownHook(new Thread(context::close));
	}
}
