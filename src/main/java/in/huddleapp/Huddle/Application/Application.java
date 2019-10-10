package in.huddleapp.Huddle.Application;

import in.huddleapp.Huddle.Utility.PackageConstants;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import static in.huddleapp.Huddle.Utility.PackageConstants.*;

@SpringBootApplication
@EntityScan(basePackages = MODEL_PACKAGE)
@ComponentScan(basePackages = { CONTROLLER_PACKAGE })
@EnableJpaRepositories(basePackages = REPOSITORY_PACKAGE)
public class Application extends SpringBootServletInitializer
{
		public static void main(String[] args)
		{
				SpringApplication.run(Application.class, args);
		}
}
