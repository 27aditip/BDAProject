package edu.mit.miniproject.MiniProject;

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
public class TransactionsController {
	private static final Logger LOGGER= LogManager.getLogger(TransactionsController.class);
	
	@Autowired
	TransactionService ts;
	
	@PostMapping("/add")
	public Transactions create(@RequestBody Transactions ft) {
		LOGGER.info(ft.toString());
		return ts.save(ft);
	}
	
	@GetMapping("/transactions")
	public List<Transactions> getAllTransaction(){
		LOGGER.info(ts.findAll().toString());
		return ts.findAll();  
	}
}


