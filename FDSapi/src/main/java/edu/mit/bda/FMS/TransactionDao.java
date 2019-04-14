package edu.mit.bda.FMS;

import java.util.List;
import javax.persistence.EntityExistsException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransactionDao {
	@Autowired
	TransactionRepository transactionRepository;
	
	/*to save a transaction*/
	
	public Transaction save(Transaction trans) {
		return transactionRepository.save(trans);
	}
	
	/* search all transactions*/
	
	public List<Transaction> findAll(){
		return transactionRepository.findAll();
	}
	
}
