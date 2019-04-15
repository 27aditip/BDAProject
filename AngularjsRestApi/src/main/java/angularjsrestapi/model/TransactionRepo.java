package angularjsrestapi.model;



import org.springframework.data.jpa.repository.JpaRepository;

import angularjsrestapi.model.Transaction;

public interface TransactionRepo  extends JpaRepository<Transaction, Long> {
}