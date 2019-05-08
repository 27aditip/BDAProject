package edu.mit.bigdata.project.fms.jpa.domain;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//@Table(appliesTo = "FRAUD_TRANSACTION")
@Entity
@Table(name = "FRAUD_TRANSACTION")
public class FraudTransaction implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "transactionId")
    private String transactionId;

    private String userID;
    private String fromAC;
    private String fromBankIFSC;
    private String toAC;
    private String toBankIFSC;
    private String currency;
    private Timestamp transactionDate;
    private Double transactionAmount;
    private String transactionType;

    private String transactionLocation;
    private String isFraud;
    private String fraudHandlerUserID;
    private String comments;

    // standard getters and setters

    /**
     * @return the transactionId
     */
    public String getTransactionId() {
        return transactionId;
    }

    /**
     * @param transactionId
     *            the transactionId to set
     */
    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    /**
     * @return the userID
     */
    public String getUserID() {
        return userID;
    }

    /**
     * @param userID
     *            the userID to set
     */
    public void setUserID(String userID) {
        this.userID = userID;
    }

    /**
     * @return the fromAC
     */
    public String getFromAC() {
        return fromAC;
    }

    /**
     * @param fromAC
     *            the fromAC to set
     */
    public void setFromAC(String fromAC) {
        this.fromAC = fromAC;
    }

    /**
     * @return the fromBankIFSC
     */
    public String getFromBankIFSC() {
        return fromBankIFSC;
    }

    /**
     * @param fromBankIFSC
     *            the fromBankIFSC to set
     */
    public void setFromBankIFSC(String fromBankIFSC) {
        this.fromBankIFSC = fromBankIFSC;
    }

    /**
     * @return the toAC
     */
    public String getToAC() {
        return toAC;
    }

    /**
     * @param toAC
     *            the toAC to set
     */
    public void setToAC(String toAC) {
        this.toAC = toAC;
    }

    /**
     * @return the toBankIFSC
     */
    public String getToBankIFSC() {
        return toBankIFSC;
    }

    /**
     * @param toBankIFSC
     *            the toBankIFSC to set
     */
    public void setToBankIFSC(String toBankIFSC) {
        this.toBankIFSC = toBankIFSC;
    }

    /**
     * @return the currency
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * @param currency
     *            the currency to set
     */
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     * @return the transactionDate
     */
    public Timestamp getTransactionDate() {
        return transactionDate;
    }

    /**
     * @param transactionDate
     *            the transactionDate to set
     */
    public void setTransactionDate(Timestamp transactionDate) {
        this.transactionDate = transactionDate;
    }

    /**
     * @return the transactionAmount
     */
    public Double getTransactionAmount() {
        return transactionAmount;
    }

    /**
     * @param transactionAmount
     *            the transactionAmount to set
     */
    public void setTransactionAmount(Double transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

    /**
     * @return the transactionType
     */
    public String getTransactionType() {
        return transactionType;
    }

    /**
     * @param transactionType
     *            the transactionType to set
     */
    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    /**
     * @return the transactionLocation
     */
    public String getTransactionLocation() {
        return transactionLocation;
    }

    /**
     * @param transactionLocation
     *            the transactionLocation to set
     */
    public void setTransactionLocation(String transactionLocation) {
        this.transactionLocation = transactionLocation;
    }

    /**
     * @return the isFraud
     */
    public String getIsFraud() {
        return isFraud;
    }

    /**
     * @param isFraud
     *            the isFraud to set
     */
    public void setIsFraud(String isFraud) {
        this.isFraud = isFraud;
    }

    /**
     * @return the fraudHandlerUserID
     */
    public String getFraudHandlerUserID() {
        return fraudHandlerUserID;
    }

    /**
     * @param fraudHandlerUserID
     *            the fraudHandlerUserID to set
     */
    public void setFraudHandlerUserID(String fraudHandlerUserID) {
        this.fraudHandlerUserID = fraudHandlerUserID;
    }

    /**
     * @return the comments
     */
    public String getComments() {
        return comments;
    }

    /**
     * @param comments
     *            the comments to set
     */
    public void setComments(String comments) {
        this.comments = comments;
    }

	@Override
	public String toString() {
		return "FraudTransaction [transactionId=" + transactionId + ", userID=" + userID + ", fromAC=" + fromAC
				+ ", fromBankIFSC=" + fromBankIFSC + ", toAC=" + toAC + ", toBankIFSC=" + toBankIFSC + ", currency="
				+ currency + ", transactionDate=" + transactionDate + ", transactionAmount=" + transactionAmount
				+ ", transactionType=" + transactionType + ", transactionLocation=" + transactionLocation + ", isFraud="
				+ isFraud + ", fraudHandlerUserID=" + fraudHandlerUserID + ", comments=" + comments + "]";
	}

    
}