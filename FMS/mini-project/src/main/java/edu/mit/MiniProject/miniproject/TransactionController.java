package edu.mit.MiniProject.miniproject;

import java.util.List;

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

@RestController
@CrossOrigin
@RequestMapping("/api")
public class TransactionController {
	
	private static final Logger LOGGER= LogManager.getLogger(TransactionController.class);

	@Autowired
	TransactionCRUD tcrud;
	
	// Save Transaction
	@PostMapping("/add")
	public Transaction create(@RequestBody Transaction t) {
		Transaction at =  tcrud.save(t);
		LOGGER.info(at);
		return at;
	}
	
	@GetMapping("/transactions")
	public List<Transaction> getAllTansactions(){
		LOGGER.info(tcrud.findAll().toString());
		return tcrud.findAll();
	}
	
	@GetMapping("/transactions/{id}")
	public ResponseEntity<Transaction> getOneTansactions(@PathVariable(value="id") Long id){
		Transaction t = tcrud.findById(id);
		
		if(t == null) {
			return ResponseEntity.notFound().build();
		} else {
			return ResponseEntity.ok().body(t);
		}
	}
}
