package edu.mit;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepo  extends JpaRepository<Transaction,Long> {
	

}
