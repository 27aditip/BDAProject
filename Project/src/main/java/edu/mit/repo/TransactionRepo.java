package edu.mit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.mit.model.Transaction;

public interface TransactionRepo  extends JpaRepository<Transaction,String> {
	

}
