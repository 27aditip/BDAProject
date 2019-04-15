package edu.mit;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.mit.model.Transaction;
import edu.mit.repo.TransactionRepo;

@Service
public class TransactionDao {

	@Autowired
	private TransactionRepo transactionrepo;
	
	//save an transaction
	
	public TransactionDao(TransactionRepo transactionrepo) {
		this.transactionrepo=transactionrepo;
	}
	
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
