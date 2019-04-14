package edu.mit.bigdata.project.fms;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@ComponentScan
//@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class, HibernateJpaAutoConfiguration.class}) //added for MySQL
@EntityScan("edu.mit.bigdata.project.fms.jpa.domain")
@EnableJpaRepositories("edu.mit.bigdata.project.fms.jpa.repository")
@SpringBootApplication
public class FmsApplication extends SpringBootServletInitializer {

	private static final Logger LOGGER = LogManager.getLogger(FmsApplication.class);

	public static void main(String[] args) {
		LOGGER.info("Starting the application...");
		SpringApplication.run(FmsApplication.class, args);
	}

}
