package com.restApi.driver;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name="transactions")
@EntityListeners(AuditingEntityListener.class)
public class CustomerTransaction {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public Long transactionId;
	
	@Temporal(TemporalType.TIMESTAMP)
	@LastModifiedDate
	public Date transactionDate;
	
	public String userId;
	
	public String transactionChannel;
	
	public String transactionType;
	
	public String fromAccount;
	
	public String fromIFSC;
	
	public String toAccount;
	
	public String toIFSC;
	
	public Float amount;
	
	public String location;
	
	public String isFraud;
	
	public String fraudHandlerId;
	
	public String comments;

	public Long getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(Long transactionId) {
		this.transactionId = transactionId;
	}

	public Date getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getTransactionChannel() {
		return transactionChannel;
	}

	public void setTransactionChannel(String transactionChannel) {
		this.transactionChannel = transactionChannel;
	}

	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	public String getFromAccount() {
		return fromAccount;
	}

	public void setFromAccount(String fromAccount) {
		this.fromAccount = fromAccount;
	}

	public String getFromIFSC() {
		return fromIFSC;
	}

	public void setFromIFSC(String fromIFSC) {
		this.fromIFSC = fromIFSC;
	}

	public String getToAccount() {
		return toAccount;
	}

	public void setToAccount(String toAccount) {
		this.toAccount = toAccount;
	}

	public String getToIFSC() {
		return toIFSC;
	}

	public void setToIFSC(String toIFSC) {
		this.toIFSC = toIFSC;
	}

	public Float getAmount() {
		return amount;
	}

	public void setAmount(Float amount) {
		this.amount = amount;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getIsFraud() {
		return isFraud;
	}

	public void setIsFraud(String isFraud) {
		this.isFraud = isFraud;
	}

	public String getFraudHandlerId() {
		return fraudHandlerId;
	}

	public void setFraudHandlerId(String fraudHandlerId) {
		this.fraudHandlerId = fraudHandlerId;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	@Override
    public String toString() {
        return "[" + (transactionId != null ? transactionId + ", " : "") + (userId != null ? userId + ", " : "") + (fromAccount != null ? fromAccount + ", " : "")
                + (fromIFSC != null ? fromIFSC + ", " : "") + (toAccount != null ? toAccount + ", " : "") + (toIFSC != null ? toIFSC + ", " : "") 
                + (transactionDate != null ? transactionDate + ", " : "") + (amount != null ? amount + ", " : "") + (transactionType != null ? transactionType + ", " : "") + (transactionChannel != null ? transactionChannel + ", " : "")
                + (location != null ? location + ", " : "") + (isFraud != null ? isFraud + ", " : "") + (fraudHandlerId != null ? fraudHandlerId + ", " : "")
                + (comments != null ? comments : "") + "]";
    }
		
}
