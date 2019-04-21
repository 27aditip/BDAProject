package com.driver;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class TransactionService {
	
	private  TransactionRepository transactionRepository;
	
	@Autowired
	public TransactionService(TransactionRepository transactionRepository){
	
		this.transactionRepository=transactionRepository;
	
	}
	
	public Transaction save(Transaction transaction){
		
		return transactionRepository.save(transaction);
	}
	
	public List<Transaction> findAll(){
		return transactionRepository.findAll();
	}

}
