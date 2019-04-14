package com.restApi.driver;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerTransactionRepo extends JpaRepository<CustomerTransaction, Long> {

//	CustomerTransaction findByTransactionId(Integer transactionId);
}
