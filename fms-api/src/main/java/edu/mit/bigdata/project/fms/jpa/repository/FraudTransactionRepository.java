package edu.mit.bigdata.project.fms.jpa.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import edu.mit.bigdata.project.fms.jpa.domain.FraudTransaction;

@RepositoryRestResource(collectionResourceRel = "frauds", path = "frauds")
public interface FraudTransactionRepository extends CrudRepository<FraudTransaction, String> {

	
	@Override
	@RestResource(exported = false)
	void deleteById(String transactionId);

	
	@RestResource(path = "transaction", rel = "customTransactionIdSearch")
	FraudTransaction findByTransactionId(@Param("transactionId") String transactionId);

}
