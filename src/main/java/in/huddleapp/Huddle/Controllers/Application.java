package in.huddleapp.Huddle.Controllers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackageClasses = { HomeController.class, UserRepository.class })
public class Application extends SpringBootServletInitializer
{

		public static void main(String[] args)
		{
				SpringApplication.run(Application.class, args);
		}

}
