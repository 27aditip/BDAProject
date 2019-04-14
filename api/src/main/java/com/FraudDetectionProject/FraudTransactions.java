package com.FraudDetectionProject;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

import org.hibernate.annotations.CreationTimestamp;
import java.util.Date;

import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

//@SuppressWarnings("deprecation")
@Entity
@Table(name = "Fraud_Transaction" ,uniqueConstraints = {@UniqueConstraint(columnNames = {"userID"})})
@EntityListeners(AuditingEntityListener.class)

public class FraudTransactions {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long transactionID; 
	
//	@NotBlank
//	@Column(unique=true)
	private long userID;
	
//	@NotBlank
	private String fromAC;
	
//	@NotBlank
	private String fromBankIFSC;
	
//	@NotBlank
	private String toAC;
	
//	@NotBlank
	private String toBankIFSC;
	
//	@NotBlank
	private String currency;

	@Temporal(TemporalType.TIMESTAMP)
	@CreationTimestamp
	private Date transactionDate;
	
//	@NotBlank
	private Float transactionAmount;
	
//	@NotBlank
	private String transactionType;
	
//	@NotBlank
	private String transactionLocation;
	
//	@NotBlank
	@Temporal(TemporalType.TIMESTAMP)
	@LastModifiedDate
	private Date loggingDate;
	
	private String isFraud;
	
//	@NotBlank
	private String fraudHandlerUserID;
	
	private String comments;
	
// Getter & Setter

	public long getTransactionID() {
		return transactionID;
	}

	public void setTransactionID(long transactionID) {
		this.transactionID = transactionID;
	}

	public long getUserID() {
		return userID;
	}

	public void setUserID(long userID) {
		this.userID = userID;
	}

	public String getFromAC() {
		return fromAC;
	}

	public void setFromAC(String fromAC) {
		this.fromAC = fromAC;
	}

	public String getFromBankIFSC() {
		return fromBankIFSC;
	}

	public void setFromBankIFSC(String fromBankIFSC) {
		this.fromBankIFSC = fromBankIFSC;
	}

	public String getToAC() {
		return toAC;
	}

	public void setToAC(String toAC) {
		this.toAC = toAC;
	}

	public String getToBankIFSC() {
		return toBankIFSC;
	}

	public void setToBankIFSC(String toBankIFSC) {
		this.toBankIFSC = toBankIFSC;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public Date getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}

	public Float getTransactionAmount() {
		return transactionAmount;
	}

	public void setTransactionAmount(Float transactionAmount) {
		this.transactionAmount = transactionAmount;
	}

	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
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
	
// ToString() ----------->

	@Override
	public String toString() {
		return "FraudTransactions [transactionID=" + transactionID + ", userID=" + userID + ", fromAC=" + fromAC
				+ ", fromBankIFSC=" + fromBankIFSC + ", toAC=" + toAC + ", toBankIFSC=" + toBankIFSC + ", currency="
				+ currency + ", transactionDate=" + transactionDate + ", transactionAmount=" + transactionAmount
				+ ", transactionType=" + transactionType + ", transactionLocation=" + transactionLocation
				+ ", loggingDate=" + loggingDate + ", isFraud=" + isFraud + ", fraudHandlerUserID=" + fraudHandlerUserID
				+ ", comments=" + comments + "]";
	}

	
	
}
