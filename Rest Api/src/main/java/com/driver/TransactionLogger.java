package com.driver;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.driver.TransactionDao;
import com.driver.TransactionLogger;


@RestController
@RequestMapping("/api")
public class TransactionLogger {
	
	
	
	@Autowired
	private TransactionDao transactionDao;
	private static final Logger LOGGER= LogManager.getLogger(TransactionLogger.class); 
	//public TransactionLogger(TransactionLogger transactionLogger) {
		//this.transactionLogger=transactionLogger;
	
	
	//}
	/* to save a transaction*/
	@PostMapping("/post")
	public Transaction create(@RequestBody Transaction transaction) {
		LOGGER.info("Post: "+transactionDao.save(transaction).toString());
		return transactionDao.save(transaction);
	}
	
	/*get all transactions*/
	@GetMapping("/get")
	public List<Transaction> getAllTransaction(){
		LOGGER.info("Get: "+transactionDao.findAll().toString());
		return transactionDao.findAll();
		
	}
	
}
