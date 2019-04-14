package com.driver;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
  
@Service

public class TransactionDao {

	@Autowired
	TransactionRepo transactionRepo;
	
	//save an transaction
	
	public Transaction save(Transaction tr) {
		return transactionRepo.save(tr); 
	}
	
	public List<Transaction> findAll(){
		return transactionRepo.findAll(); 
	}
	
//	public Transaction findOne(String transactionId) {
//		return transactionRepo.findOne(transactionId);
//	}
}
