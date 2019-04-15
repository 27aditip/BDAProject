package edu.mit.miniproject.MiniProject;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

@Service
@ComponentScan(basePackageClasses = TransactionRepository.class)
public class TransactionService {

	@Autowired
	TransactionRepository transRepo;
	
	public Transactions save(Transactions ft) {
		return transRepo.save(ft);
	}
	
	public List<Transactions> findAll(){
		return transRepo.findAll();
	}
}
