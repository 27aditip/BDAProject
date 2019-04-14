package edu.bda.MiniProject.Fms;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransactionServices {
	
	@Autowired
	FraudTransactionRepository ftr;
	
	public Transaction save(Transaction ft) {
		return ftr.save(ft);
	}
	
	public List<Transaction> findAll(){
		return ftr.findAll();
	}

}
