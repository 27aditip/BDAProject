package edu.mit.bigdata.project.fms.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Vinod
 *
 */
public class Transaction implements Serializable {

    private static final long serialVersionUID = 1L;

    private String transactionId;

    private String userID;
    private String fromAC;
    private String fromBankIFSC;
    private String toAC;
    private String toBankIFSC;
    private String currency;
    private Date transactionDate;
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

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "[" + (transactionId != null ? transactionId + ", " : "") + (userID != null ? userID + ", " : "") + (fromAC != null ? fromAC + ", " : "")
                + (fromBankIFSC != null ? fromBankIFSC + ", " : "") + (toAC != null ? toAC + ", " : "") + (toBankIFSC != null ? toBankIFSC + ", " : "") + (currency != null ? currency + ", " : "")
                + (transactionDate != null ? transactionDate + ", " : "") + (transactionAmount != null ? transactionAmount + ", " : "") + (transactionType != null ? transactionType + ", " : "")
                + (transactionLocation != null ? transactionLocation + ", " : "") + (isFraud != null ? isFraud + ", " : "") + (fraudHandlerUserID != null ? fraudHandlerUserID + ", " : "")
                + (comments != null ? comments : "") + "]";
    }

	public Date getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}

}