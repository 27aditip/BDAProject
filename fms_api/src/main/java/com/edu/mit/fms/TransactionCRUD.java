package com.edu.mit.fms;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransactionCRUD {

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
	
//	// Read Transactions
//	public Transactions findById(long id){
//		return trans_repo.findById(id).get();
//	}
}