package edu.mit.MiniProject.miniproject;

import java.util.List; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransactionCRUD {
	
//	private static final Logger LOGGER = LogManager.getLogger(MiniProjectApplication.class);
	

	@Autowired
	TransactionsRepo trans_repo;
	
	// Save Transactions
	public Transactions save(Transactions t) {
		return trans_repo.save(t); 
	}
	
	// Read Transactions
	public List<Transactions> findAll(){

		return trans_repo.findAll();
	}
	
	
}
