package edu.mit.MiniProject.miniproject;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionsRepo extends JpaRepository<Transaction, Long> {

}
