package edu.mit.bda.FMS;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
@Configuration
@ComponentScan(basePackageClasses=TransactionController.class)
@SpringBootApplication
@EnableJpaAuditing
public class TransactionApplication {
	private static final Logger LOGGER = LogManager.getLogger(TransactionApplication.class);

public static void main(String[] args) {
	SpringApplication.run(TransactionApplication.class, args);
	}
}
