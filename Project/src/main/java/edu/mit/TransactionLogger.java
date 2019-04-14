package edu.mit;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class TransactionLogger {
	
	private static final Logger LOGGER= LogManager.getLogger(TransactionLogger.class); 
	
	@Autowired
	private TransactionDao transactionDAO;
	
	/* to save a transaction*/
	@PostMapping("/transaction")
	public Transaction create(@RequestBody Transaction transaction) {
		LOGGER.info("Data: "+transactionDAO.save(transaction));
		return transactionDAO.save(transaction);
	}
	
	/*get all transactions*/
	@GetMapping("/transactions")
	public List<Transaction> getAlltransactions(){
		LOGGER.info("Data: "+transactionDAO.findAll().toString());
		return transactionDAO.findAll();
		
	}
	
}