package angularjsrestapi.model;


import java.util.List;

import javax.validation.Valid;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Bank")
public class TransactionController {
	
	private static final Logger LOGGER = LogManager.getLogger(TransactionController.class);
	
	@Autowired
	TransactionDAO transDAO;
	
	
	
	//to save the transaction
	//when url with /Bank/transactions and method is post
	@PostMapping("/transcation")
	public Transaction createtransaction(@Valid @RequestBody Transaction tr) {
		LOGGER.info(tr.toString());
		return transDAO.save(tr);
	}
	
	//get all transactions
	
	@GetMapping("/getAlltransactions")
	
	public List<Transaction> getAlltransactions(){
		LOGGER.info(transDAO.findAll().toString());
		return transDAO.findAll();
	}
	
	//get transaction by transaction id
	
	/*@GetMapping("/notes/{transactionId}")
	public ResponseEntity<transaction> gettransactionById(@PathVariable(value="transactionId") String transactionId){
		
		transaction tr=transactionDAO.findOne(transactionId);
		
		if(tr==null) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok().body(tr);
	}*/
	
	
	
	
}
