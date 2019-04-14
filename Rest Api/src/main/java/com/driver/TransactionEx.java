package com.driver;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
//import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

//import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableJpaAuditing
@ComponentScan(basePackageClasses = TransactionLogger.class)
public class TransactionEx {

	private static final Logger LOGGER = LogManager.getLogger(TransactionEx.class);

	public static void main(String[] args) 
	{
		LOGGER.info("Starting the application");
		SpringApplication.run(TransactionEx.class, args);
	}
}

