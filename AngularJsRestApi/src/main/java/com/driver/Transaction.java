package com.driver;

import java.sql.Timestamp;
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
@Table(name="Transaction")
@EntityListeners(AuditingEntityListener.class)
public class Transaction {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long transactionId ; 
	private String userid ;
	private String fromac ;
	private String frombankifsc ;
	private String toac ;
	private String tobankifsc ;
	private String currency ;
	
	@Temporal(TemporalType.TIMESTAMP)
	@LastModifiedDate
	private Date transactiondate ;
	
	private Float transactionamount ;
	private String transactiontype ;
	private String transactionlocation ; 
	
	@Temporal(TemporalType.TIMESTAMP)
	@LastModifiedDate
	private Date loggingdate ;
	private String isfraud ;
	private String fraudhandleruserid ;
	private String comments ;
	
	
	public Long getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(Long transactionId) {
		this.transactionId = transactionId;
	}
	
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	
	public String getFromac() {
		return fromac;
	}
	public void setFromac(String fromac) {
		this.fromac = fromac;
	}
	
	public String getFrombankifsc() {
		return frombankifsc;
	}
	public void setFrombankifsc(String fromBankifsc) {
		this.frombankifsc = fromBankifsc;
	}
	
	public String gettoac() {
		return toac;
	}
	public void settoac(String toac) {
		this.toac = toac;
	}
	
	public String getTobankifsc() {
		return tobankifsc;
	}
	public void setTobankifsc(String toBankifsc) {
		this.tobankifsc = toBankifsc;
	}
	
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	
	public Date gettransactiondate() {
		return transactiondate;
	}
	public void settransactiondate(Timestamp transactiondate) {
		this.transactiondate = transactiondate;
	}
	
	public Float gettransactionamount() {
		return transactionamount;
	}
	public void settransactionamount(Float transactionamount) {
		this.transactionamount = transactionamount;
	}			
	
	public String gettransactiontype() {
		return transactiontype;
	}
	public void settransactiontype(String transactiontype) {
		this.transactiontype = transactiontype;
	}
	
	public String gettransactionlocation() {
		return transactionlocation;
	}
	public void setransactionlocation(String transactionlocation) {
		this.transactionlocation = transactionlocation;
	}
	
	public Date getLoggingdate() {
		return loggingdate;
	}
	public void setLoggingdate(Timestamp loggingdate) {
		this.loggingdate = loggingdate;
	}
	
	public String getIsfraud() {
		return isfraud;
	}
	public void setIsfraud(String isfraud) {
		this.isfraud = isfraud;
	}
	
	public String getFraudhandleruserid() {
		return fraudhandleruserid;
	}
	public void setFraudhandleruserid(String fraudhandleruserid) {
		this.fraudhandleruserid = fraudhandleruserid;
	}
	
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	
	@Override
	public String toString() {
		return "Transaction [transactionId=" + transactionId + ", userid=" + userid + ", fromac=" + fromac
				+ ", frombankifsc=" + frombankifsc + ", toac=" + toac + ", tobankifsc=" + tobankifsc + ", currency="
				+ currency + ", transactiondate=" + transactiondate + ", transactionamount=" + transactionamount
				+ ", transactiontype=" + transactiontype + ", transactionlocation=" + transactionlocation
				+ ", loggingdate=" + loggingdate + ", isfraud=" + isfraud + ", fraudhandleruserid=" + fraudhandleruserid
				+ ", comments=" + comments + "]";
	}

}
