package com.driver;

import org.apache.logging.log4j.LogManager;

import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import com.driver.TransactionDriver;

@SpringBootApplication
@EnableJpaAuditing
@ComponentScan(basePackageClasses = TransactionResource.class)
public class TransactionDriver {
	
	private static final Logger LOGGER=LogManager.getLogger(TransactionDriver.class);
	public static void main(String[] args) {
		//LOGGER.info("Starting logging");
		SpringApplication.run(TransactionDriver.class, args);
	}
}
