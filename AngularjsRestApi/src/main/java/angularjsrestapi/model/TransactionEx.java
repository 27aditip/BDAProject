package angularjsrestapi.model;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing 
public class TransactionEx {
	private static final Logger LOGGER=LogManager.getLogger(TransactionEx.class);
	public static void main(String[] args) {
		LOGGER.info("Starting Logging");
		 SpringApplication.run(TransactionEx.class, args);
	}

}
