package edu.mit.bigdata.project.fms.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.mit.bigdata.project.fms.domain.Transaction;

@RestController
@RequestMapping(path = "/fms/api")
public class TransactionLoggerService {

	private static final Logger LOGGER = LogManager.getLogger(TransactionLoggerService.class);

	@GetMapping("/transaction")
	public String usage() {
		return "Service used to log transaction details.";
	}

	@PostMapping("/transaction")
	public void logTransaction(@RequestBody Transaction transaction) throws Exception {
		String transactionType = transaction.getTransactionType();
		String errorMessage = null;
		switch (transactionType) {
		case "UPI":
			if (!StringUtils.isEmpty(transaction.getFromBankIFSC())) {
				errorMessage = "FromBankIFSC must be null";
			}
			break;
		default:
			break;
		}
		
		if (!StringUtils.isEmpty(errorMessage)) {
			throw new Exception(errorMessage);
		} else {
			LOGGER.info("New Transaction => " + transaction.toString());
		}
	}
}
