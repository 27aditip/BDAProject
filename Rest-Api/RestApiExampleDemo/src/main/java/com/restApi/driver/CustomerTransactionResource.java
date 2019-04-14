package com.restApi.driver;

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
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController
@RequestMapping("/api")
public class CustomerTransactionResource {
	
	@Autowired
	private CustomerService customerService;
	
	private static final Logger LOGGER= LogManager.getLogger(CustomerTransactionResource.class);
	
	public CustomerTransactionResource(CustomerService customerService) {
		this.customerService=customerService;
	}
	
 
	@PostMapping("/transactions")
	public CustomerTransaction createTransaction(@Valid @RequestBody CustomerTransaction customerTransaction ) {
		LOGGER.info("Data@@@@@: "+ customerService.save(customerTransaction).toString());
		return customerService.save(customerTransaction);
	}
	
	@GetMapping("/transactions")
	public List<CustomerTransaction> getAllTransactions(){
		LOGGER.info("Data@@@@@: "+customerService.findAll().toString());
		return customerService.findAll();
	} 
	
//	@GetMapping("/transactions/{id}")
//	public ResponseEntity<CustomerTransaction> findByTransactionId(@PathVariable(value="transactionId") int transactionId){
//		CustomerTransaction customerTransaction=customerService.findByTransactionId(transactionId);
//		
//		if(customerTransaction==null) {
//			return ResponseEntity.notFound().build();
//		}
//		return ResponseEntity.ok().body(customerTransaction);
//		
//	}
}
