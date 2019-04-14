 package edu.mit.MiniProject.miniproject;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "Transaction")
@EntityListeners(AuditingEntityListener.class)
public class Transaction {
	
	@Id @GeneratedValue
	public long Id;
	
	public long userID;
	
	public String channel;
	
	public String transactionType;
	
	public String fromAccountNo;
	
	public String fromIFSC;
	
	public String toAccountNo;
	
	public String toIFSC;
	
	private String currency;
	
	public float amount;

	@Temporal(TemporalType.TIMESTAMP)
	@LastModifiedDate
	public Date tdate;
	
	private String transactionLocation;
	
	@Temporal(TemporalType.TIMESTAMP)
	@LastModifiedDate
	public Date loggingDate;
	
	public String isFraud;
	
	public String fraudHandlerUserID;
	
	public String comments;

	public String getChannel() {
		return channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
	}

	public long getId() {
		return Id;
	}

	public void setId(long id) {
		Id = id;
	}

	public long getUserID() {
		return userID;
	}

	public void setUserID(long userID) {
		this.userID = userID;
	}

	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	public String getFromAccountNo() {
		return fromAccountNo;
	}

	public void setFromAccountNo(String fromAccountNo) {
		this.fromAccountNo = fromAccountNo;
	}

	public String getFromIFSC() {
		return fromIFSC;
	}

	public void setFromIFSC(String fromIFSC) {
		this.fromIFSC = fromIFSC;
	}

	public String getToAccountNo() {
		return toAccountNo;
	}

	public void setToAccountNo(String toAccountNo) {
		this.toAccountNo = toAccountNo;
	}

	public String getToIFSC() {
		return toIFSC;
	}

	public void setToIFSC(String toIFSC) {
		this.toIFSC = toIFSC;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	public Date getTdate() {
		return tdate;
	}

	public void setTdate(Date tdate) {
		this.tdate = tdate;
	}

	public String getTransactionLocation() {
		return transactionLocation;
	}

	public void setTransactionLocation(String transactionLocation) {
		this.transactionLocation = transactionLocation;
	}

	public Date getLoggingDate() {
		return loggingDate;
	}

	public void setLoggingDate(Date loggingDate) {
		this.loggingDate = loggingDate;
	}

	public String getIsFraud() {
		return isFraud;
	}

	public void setIsFraud(String isFraud) {
		this.isFraud = isFraud;
	}

	public String getFraudHandlerUserID() {
		return fraudHandlerUserID;
	}

	public void setFraudHandlerUserID(String fraudHandlerUserID) {
		this.fraudHandlerUserID = fraudHandlerUserID;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	@Override
	public String toString() {
		return "Transaction [Id=" + Id + ", userID=" + userID + ", "
				+ (channel != null ? "channel=" + channel + ", " : "")
				+ (transactionType != null ? "transactionType=" + transactionType + ", " : "")
				+ (fromAccountNo != null ? "fromAccountNo=" + fromAccountNo + ", " : "")
				+ (fromIFSC != null ? "fromIFSC=" + fromIFSC + ", " : "")
				+ (toAccountNo != null ? "toAccountNo=" + toAccountNo + ", " : "")
				+ (toIFSC != null ? "toIFSC=" + toIFSC + ", " : "")
				+ (currency != null ? "currency=" + currency + ", " : "") + "amount=" + amount + ", "
				+ (tdate != null ? "tdate=" + tdate + ", " : "")
				+ (transactionLocation != null ? "transactionLocation=" + transactionLocation + ", " : "")
				+ (loggingDate != null ? "loggingDate=" + loggingDate + ", " : "")
				+ (isFraud != null ? "isFraud=" + isFraud + ", " : "")
				+ (fraudHandlerUserID != null ? "fraudHandlerUserID=" + fraudHandlerUserID + ", " : "")
				+ (comments != null ? "comments=" + comments : "") + "]";
	}

}
