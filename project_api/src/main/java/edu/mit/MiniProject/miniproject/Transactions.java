package edu.mit.MiniProject.miniproject;

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
@Table(name = "Transactions")
@EntityListeners(AuditingEntityListener.class)
public class Transactions {
	
	@Id 
	@GeneratedValue(strategy=GenerationType.AUTO)	
	public long Id;
	
	public long userID;
	
	public String transactionType;
	
	public String fromAccount;
	
	public String fromIFSC;
	
	public String toAccount;
	
	public String toIFSC;
	
	public float amount;

	@Temporal(TemporalType.TIMESTAMP)
	@LastModifiedDate
	public Date tdate;
	
	private String tranLocation;
	
	@Temporal(TemporalType.TIMESTAMP)
	@LastModifiedDate
	public Date loggingDate;
	
	public String isFraud;
	
	public String fraudHandlerUserID;
	
	public String comments;	

	public long getId() {
		return Id;
	}

	public void setId(long Id) {
		this.Id = Id;
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

	public String getFromAccount() {
		return fromAccount;
	}

	public void setFromAccount(String fromAccountNo) {
		this.fromAccount = fromAccountNo;
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

	public void setToAccount(String toAccountNo) {
		this.toAccount = toAccountNo;
	}

	public String getToIFSC() {
		return toIFSC;
	}

	public void setToIFSC(String toIFSC) {
		this.toIFSC = toIFSC;
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
		return tranLocation;
	}

	public void setTransactionLocation(String transactionLocation) {
		this.tranLocation = transactionLocation;
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
		return "Transactions [Id=" + Id + ", userID=" + userID + ", transactionType=" + transactionType
				+ ", fromAccount=" + fromAccount + ", fromIFSC=" + fromIFSC + ", toAccount=" + toAccount + ", toIFSC="
				+ toIFSC + ", amount=" + amount + ", tdate=" + tdate + ", tranLocation=" + tranLocation
				+ ", loggingDate=" + loggingDate + ", isFraud=" + isFraud + ", fraudHandlerUserID=" + fraudHandlerUserID
				+ ", comments=" + comments + ",  getUserID()=" + getUserID()
				+ ", getTransactionType()=" + getTransactionType() + ", getFromAccount()=" + getFromAccount()
				+ ", getFromIFSC()=" + getFromIFSC() + ", getToAccount()=" + getToAccount() + ", getToIFSC()="
				+ getToIFSC() + ", getAmount()=" + getAmount() + ", getTdate()=" + getTdate()
				+ ", getTransactionLocation()=" + getTransactionLocation() + ", getLoggingDate()=" + getLoggingDate()
				+ ", getIsFraud()=" + getIsFraud() + ", getFraudHandlerUserID()=" + getFraudHandlerUserID()
				+ ", getComments()=" + getComments() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
}
