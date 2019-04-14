package edu.bda.MiniProject.Fms;


import edu.bda.MiniProject.Fms.Transaction;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FraudTransactionRepository extends JpaRepository<Transaction, Long> {

}
