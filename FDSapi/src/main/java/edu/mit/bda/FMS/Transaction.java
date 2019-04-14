package edu.mit.bda.FMS;

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
@Table(name="Fraud_Transaction")
@EntityListeners(AuditingEntityListener.class)

public class Transaction  {
	//private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private Long transactionId;

	private String userID;
	private String fromAC;
	private String fromBankIFSC;
	private String toAC;
	private String toBankIFSC;
   	private String currency;
   	@LastModifiedDate
   	@Temporal(TemporalType.TIMESTAMP)
	private Date transactionDate;
	private Double transactionAmount;
	private String transactionType;
	
	private String transactionLocation;
	private String isFraud;
	private String fraudHandlerUserID;
	private String comments;
		
	public Long getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(Long transactionId) {
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
	public Date getTransactionDate() {
		return transactionDate;
	}
	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}
	public Double getTransactionAmount() {
		return transactionAmount;
	}
	public void setTransactionAmount(Double transactionAmount) {
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
//	public static long getSerialversionuid() {
//		return serialVersionUID;
//	}
	@Override
	public String toString() {
		return "FraudTransaction [transactionId=" + transactionId + ", userID=" + userID + ", fromAC=" + fromAC
				+ ", fromBankIFSC=" + fromBankIFSC + ", toAC=" + toAC + ", toBankIFSC=" + toBankIFSC + ", currency="
				+ currency + ", transactionDate=" + transactionDate + ", transactionAmount=" + transactionAmount
				+ ", transactionType=" + transactionType + ", transactionLocation=" + transactionLocation + ", isFraud="
				+ isFraud + ", fraudHandlerUserID=" + fraudHandlerUserID + ", comments=" + comments + "]";
	}

	
}
