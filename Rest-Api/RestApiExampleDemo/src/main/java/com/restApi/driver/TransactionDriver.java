package com.restApi.driver;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class TransactionDriver {
	private static final Logger LOGGER=LogManager.getLogger(TransactionDriver.class);
	public static void main(String[] args) {
		LOGGER.info("Starting logging");
		SpringApplication.run(TransactionDriver.class, args);
		
	}
}
