package edu.mit;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransactionDao {

	@Autowired
	TransactionRepo transactionrepo;
	
	//save an transaction
	
	
	
	public Transaction save(Transaction tr) {
		return transactionrepo.save(tr); 
	}
	//springboot n hibernet will automatic save it
	
	//search for transaction 
	
	public List<Transaction> findAll(){
		return transactionrepo.findAll(); 
	}
	
	//get an transaction
	
	/*public transaction findOne(Long transactionId) {
		return transactionrepo.findOne(transactionId);
	}
	
	//get the details
	
	//delete the transaction
	
	/*public void delete(transaction tr) {
		transactionrepo.delete(tr); 
	}*/
}
