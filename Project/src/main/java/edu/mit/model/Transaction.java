package edu.mit.model;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "transactions")
@EntityListeners(AuditingEntityListener.class)
public class Transaction {

	@Id
	// @GeneratedValue(strategy=GenerationType.AUTO)
	private String transactionId;

	private String userID;

	private String fromAC;

	private String fromBankIFSC;

	private String toAC;

	private String toBankIFSC;

	private String currency;

	private Timestamp transactionDate;

	private String transactionAmount;

	private String transactionType;

	private String transactionLocation;

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
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

	public Timestamp getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(Timestamp transactionDate) {
		this.transactionDate = transactionDate;
	}

	public String getTransactionAmount() {
		return transactionAmount;
	}

	public void setTransactionAmount(String transactionAmount) {
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

	public String toString() {
		return "[" + (transactionId != null ? transactionId + ", " : "") + (userID != null ? userID + ", " : "")
				+ (fromAC != null ? fromAC + ", " : "") + (fromBankIFSC != null ? fromBankIFSC + ", " : "")
				+ (toAC != null ? toAC + ", " : "") + (toBankIFSC != null ? toBankIFSC + ", " : "")
				+ (currency != null ? currency + ", " : "") + (transactionDate != null ? transactionDate + ", " : "")
				+ (transactionAmount != null ? transactionAmount + ", " : "")
				+ (transactionType != null ? transactionType + ", " : "")
				+ (transactionLocation != null ? transactionLocation + ", " : "") + "]";
	}

}
