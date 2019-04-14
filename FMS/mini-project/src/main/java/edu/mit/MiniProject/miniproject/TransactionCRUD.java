package edu.mit.MiniProject.miniproject;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransactionCRUD {

	@Autowired
	TransactionsRepo trans_repo;
	
	// Save Transactions
	public Transaction save(Transaction t) {
		return trans_repo.save(t); 
	}
	
	// Read Transactions
	public List<Transaction> findAll(){
		return trans_repo.findAll();
	}
	
	// Read Transactions
	public Transaction findById(long id){
		return trans_repo.findById(id).get();
	}
}
