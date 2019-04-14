package edu.bda.MiniProject.Fms;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@Configuration
@SpringBootApplication
@ComponentScan(basePackageClasses = TransactionContoller.class)
@EnableJpaAuditing


public class FmsApplication {
	
	private static final Logger LOGGER = LogManager.getLogger(FmsApplication.class);

	public static void main(String[] args) {
		LOGGER.info("Starting the application...");
		SpringApplication.run(FmsApplication.class, args);
	}

}
