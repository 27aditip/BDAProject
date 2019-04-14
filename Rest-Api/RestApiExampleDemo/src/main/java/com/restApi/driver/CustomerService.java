package com.restApi.driver;

import java.util.List;

import javax.persistence.EntityExistsException;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
	
	@Autowired
	private CustomerTransactionRepo customerTransactionRepo;
	
	//private static final Logger LOGGER= LogManager.getLogger(CustomerService.class);
	
	public CustomerService(CustomerTransactionRepo customerTransactionRepo) {
		this.customerTransactionRepo=customerTransactionRepo;
	}
	
	public CustomerTransaction save(CustomerTransaction customerTransaction) {
		//System.out.println("THE CLASS IS:",customerTransactionRepo.getClass().getName());
		return customerTransactionRepo.save(customerTransaction);
	}
	
	public List<CustomerTransaction> findAll(){
		
		return customerTransactionRepo.findAll();
	}
	
//    public CustomerTransaction findOne(Long transactionId) {
//    	return customerTransactionRepo.findById);
//    } 
	
}
