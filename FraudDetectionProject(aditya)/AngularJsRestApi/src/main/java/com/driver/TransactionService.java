package com.driver;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class TransactionService {
	
	@Autowired
	private  
 transactionRepository;
	
		
	public Transaction save(Transaction transaction){
		
		return transactionRepository.save(transaction);
	}
	
	public List<Transaction> findAll(){
		return transactionRepository.findAll();
	}

}
