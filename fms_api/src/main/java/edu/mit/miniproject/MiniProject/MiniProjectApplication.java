package edu.mit.miniproject.MiniProject;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@ComponentScan(basePackageClasses = TransactionsController.class)
@EnableJpaAuditing
public class MiniProjectApplication {
	private static final Logger LOGGER = LogManager.getLogger(MiniProjectApplication.class);

	public static void main(String[] args) {
		LOGGER.info("Starting the application...");
		SpringApplication.run(MiniProjectApplication.class, args);
	}

}
