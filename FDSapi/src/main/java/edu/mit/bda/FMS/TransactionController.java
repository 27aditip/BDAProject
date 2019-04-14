package edu.mit.bda.FMS;

import java.util.List;

import javax.validation.Valid;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController
@RequestMapping("/api")
public class TransactionController {

	private static final Logger LOGGER = LogManager.getLogger(TransactionController.class);

	@Autowired
	TransactionDao transactionDao;

	
	
	/* to save a transaction */
	@PostMapping("/transaction")
	public void log(@RequestBody Transaction transaction) {
		LOGGER.info(transactionDao.save(transaction).toString());
	}

	/* get all transactions */
	@GetMapping("/get")
	public void getAllTransactions() {
	//	LOGGER.info(transactionDao.findAll().toString());
	//	return transactionDao.findAll();

	}

}
