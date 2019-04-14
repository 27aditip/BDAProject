package com.FraudDetectionProject;

import java.util.List;

import javax.validation.Valid;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/company")
public class FraudTransController {
	
	@Autowired
	FraudTransDAO fraudTransDAO;
	
	private static final Logger LOGGER = LogManager.getLogger(FraudTransController.class);
	
	/* to save a transaction*/
	@PostMapping("/transactions")
	public FraudTransactions createEntry(@Valid @RequestBody FraudTransactions entry) {

		FraudTransactions tjson = fraudTransDAO.save(entry);
		LOGGER.info("Post Data@@@@@: "+ tjson);
		return tjson;
	}
	
	/*get all transactions*/
	@GetMapping("/transactions")
	public List<FraudTransactions> getAllTransactions(){
		//LOGGER.info("Get Data@@@@@: "+ fraudTransDAO.findAll().toString());
		return fraudTransDAO.findAll();
	}
	
	/*get transaction by transactionID*/
	@GetMapping("/transactions/{id}")
	public ResponseEntity<FraudTransactions> getTransactionById(@PathVariable(value="id") Long transactionID){
		
		FraudTransactions transaction =fraudTransDAO.getOne(transactionID);
		
		if(transaction == null) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok().body(transaction);
		
	}
	
	
	/*update an transaction by transactionID*/
	@PutMapping("/transactions/{id}")
	public ResponseEntity<FraudTransactions> updateTransaction(@PathVariable(value="id") Long transactionID,@Valid @RequestBody FraudTransactions transactionDetails){
		
		FraudTransactions transaction=fraudTransDAO.getOne(transactionID);
		if(transaction==null) {
			return ResponseEntity.notFound().build();
		}
		
		transaction.setUserID(transactionDetails.getUserID());
		transaction.setFromAC(transactionDetails.getFromAC());
		transaction.setFromBankIFSC(transactionDetails.getFromBankIFSC());
		transaction.setToAC(transactionDetails.getToBankIFSC());
		transaction.setToBankIFSC(transactionDetails.getToBankIFSC());
		
		transaction.setCurrency(transactionDetails.getCurrency());
		transaction.setTransactionAmount(transactionDetails.getTransactionAmount());
		transaction.setTransactionType(transactionDetails.getTransactionType());
		transaction.setTransactionLocation(transactionDetails.getTransactionLocation());
		transaction.setIsFraud(transactionDetails.getIsFraud());
		transaction.setFraudHandlerUserID(transactionDetails.getFraudHandlerUserID());
		transaction.setComments(transactionDetails.getComments());
		
		FraudTransactions updateTransaction = fraudTransDAO.save(transaction);
		LOGGER.info("Put Data@@@@@: "+ fraudTransDAO.findAll().toString());
		return ResponseEntity.ok().body(updateTransaction);
		
		
		
	}
	
	/*Delete a transaction*/
	@DeleteMapping("/transactions/{id}")
	public ResponseEntity<FraudTransactions> deleteTransaction(@PathVariable(value="id") Long transactionID){
		
		FraudTransactions transaction = fraudTransDAO.getOne(transactionID);
		if(transaction == null) {
			return ResponseEntity.notFound().build();
		}
		fraudTransDAO.delete(transaction);
		
		return ResponseEntity.ok().build();
		
		
	}
	
	

}