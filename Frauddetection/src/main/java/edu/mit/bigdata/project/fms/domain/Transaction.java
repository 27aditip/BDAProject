package edu.mit.bigdata.project.fms.domain;

import java.io.Serializable;
import java.util.Date;

 
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