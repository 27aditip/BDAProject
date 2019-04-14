package edu.mit.MiniProject.miniproject;

import java.util.List;

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
@RequestMapping("/api")
public class TransactionController {
	private static final Logger LOGGER = LogManager.getLogger(FMS_ProjectApplication.class);

	@Autowired
	TransactionCRUD tcrud;
	
	// Save Transaction
	@PostMapping("/add")
	public Transactions create(@RequestBody Transactions t) {

		Transactions tJSON = tcrud.save(t);
		LOGGER.info("Post Data: " + tJSON);
		return tJSON;		

	}
	
	@GetMapping("/transactions")
	public List<Transactions> getAllTansactions(){
		LOGGER.info("Get Data: " +tcrud.findAll().toString());
		return tcrud.findAll();
	}
	
	@GetMapping("/transactions/{id}")
	public ResponseEntity<Transactions> getOneTansactions(@PathVariable(value="id") Long id){
		Transactions t = tcrud.findById(id);
		
		if(t == null) {
			return ResponseEntity.notFound().build();
		} else {
			return ResponseEntity.ok().body(t);
		}
	}
}
