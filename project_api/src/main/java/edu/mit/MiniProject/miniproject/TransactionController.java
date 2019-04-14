package edu.mit.MiniProject.miniproject;

import java.util.List; 

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TransactionController {
	private static final Logger LOGGER = LogManager.getLogger(MiniProjectApplication.class);

	@Autowired
	TransactionCRUD tcrud;
	
	// Save Transaction
	@PostMapping("/add")
	public Transactions create(@RequestBody Transactions t) {
		LOGGER.info(t.toString());
		return tcrud.save(t);
	}
	
	@GetMapping("/transactions")
	public List<Transactions> getAllTansactions(){
		LOGGER.info(tcrud.findAll().toString());
		return tcrud.findAll();
	}
	
}
