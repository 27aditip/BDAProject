package edu.mit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
//import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan(basePackageClasses = TransactionLogger.class)
@SpringBootApplication
public class App {

	private static final Logger LOGGER = LogManager.getLogger(App.class);

	public static void main(String[] args) {
		LOGGER.info("Starting the application...");
		SpringApplication.run(App.class, args);
	}
}