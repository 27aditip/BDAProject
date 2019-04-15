package edu.bda.MiniProject.Fms;

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
public class TransactionContoller {
	private static final Logger LOGGER= LogManager.getLogger(TransactionContoller.class);
	@Autowired
	TransactionServices ts;
	
	@PostMapping("/add")
	public Transaction create(@RequestBody Transaction ft) {
		LOGGER.info(ft.toString());
		return ts.save(ft);
	}
	
	@GetMapping("/transactions")
	public List<Transaction> getAllTransaction(){
		LOGGER.info(ts.findAll().toString());
		return ts.findAll();  
	}
}
