
package angularjsrestapi.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import angularjsrestapi.model.Transaction;

@Service
public class TransactionDAO {

	@Autowired
	private TransactionRepo transactionrepo;
	
	//save an transaction
	
	public Transaction save(Transaction tr) {
		return transactionrepo.save(tr); 
	}
	
	public List<Transaction> findAll(){
		return transactionrepo.findAll(); 
	}
}
