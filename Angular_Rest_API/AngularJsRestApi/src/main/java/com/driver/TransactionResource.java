package com.driver;

//import java.awt.PageAttributes.MediaType;
import java.util.List;

import javax.validation.Valid;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
//import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TransactionResource {
	
	private static final Logger LOGGER = LogManager.getLogger(TransactionResource.class);;
	
	@Autowired
	public TransactionService transactionService ;
	
	public TransactionResource(TransactionService transactionService){
		this.transactionService = transactionService;
	}
	
	@PostMapping("/transactions")
	public Transaction createTransaction(@Valid @RequestBody Transaction transaction ) {
		LOGGER.info("POST : "+ transactionService.save(transaction).toString());
		return transactionService.save(transaction);
	}
	
	@GetMapping("/getAllTransactions")
	public List<Transaction> getAllTransactions(){
		LOGGER.info("GET : "+transactionService.findAll().toString());
		return transactionService.findAll();
	} 
}
