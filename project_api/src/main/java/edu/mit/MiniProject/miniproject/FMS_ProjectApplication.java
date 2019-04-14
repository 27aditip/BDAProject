package edu.mit.MiniProject.miniproject;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@ComponentScan(basePackageClasses = TransactionController.class)
@EnableJpaAuditing
public class FMS_ProjectApplication {

	private static final Logger LOGGER = LogManager.getLogger(FMS_ProjectApplication.class);
	
	public static void main(String[] args) {
		LOGGER.info("Starting the application...");
		SpringApplication.run(FMS_ProjectApplication.class, args);
	}
}
