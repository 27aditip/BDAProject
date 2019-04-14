package com.FraudDetectionProject;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FraudTransDAO {
	
	@Autowired
	FraudTransRepository transactionRepository;
	
	/*to save an employee*/
	
	public FraudTransactions save(FraudTransactions transaction) {
		return transactionRepository.save(transaction);
	}
	
	
	/* search all employees*/
	
	public List<FraudTransactions> findAll(){
		return transactionRepository.findAll();
	}
	
	
	/*get an employee by id*/
	public FraudTransactions getOne(Long transactionID) {
		return transactionRepository.getOne(transactionID);
	}
	
	
	/*delete an employee*/
	
	public void delete(FraudTransactions transactionID) {
		transactionRepository.delete(transactionID);
	}
	
}