package edu.mit.bigdata.project.fms.jpa.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import edu.mit.bigdata.project.fms.jpa.domain.FraudTransaction;

@RepositoryRestResource(collectionResourceRel = "frauds", path = "frauds")
public interface FraudTransactionRepository extends CrudRepository<FraudTransaction, String> {

	/**
	 * Hide the delete method
	 */
	@Override
	@RestResource(exported = false)
	void deleteById(String transactionId);

	/**
	 * Replace
	 * http://localhost:8080/frauds/search/findByTransactionId{?transactionId}"
	 * <BR/>
	 * With http://localhost:8080/frauds/search/transaction{?transactionId}"
	 * 
	 * @param transactionId
	 * @return
	 */
	@RestResource(path = "transaction", rel = "customTransactionIdSearch")
	FraudTransaction findByTransactionId(@Param("transactionId") String transactionId);

}
