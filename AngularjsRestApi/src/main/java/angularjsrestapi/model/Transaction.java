package angularjsrestapi.model;


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

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name="transactions")
@EntityListeners(AuditingEntityListener.class)
public class Transaction {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	 private long transactionId;
		
	    private String userId;
		
	    private String fromAC;
		
	    private String fromBankIFSC;
		
	    private String toAC;
	    private String toBankIFSC;
		
		
	    private String currency;
	    @Temporal(TemporalType.TIMESTAMP)
	    @LastModifiedDate
	    public Date transactionDate;
	    
	    private Double transactionAmount;
	    
	    
	    private String transactionType;

	    private String transactionLocation;

		public long getTransactionId() {
			return transactionId;
		}

		public void setTransactionId(long transactionId) {
			this.transactionId = transactionId;
		}

		public String getUserId() {
			return userId;
		}

		public void setUserId(String userId) {
			this.userId = userId;
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

		@Override
		public String toString() {
			return "Transaction [transactionId=" + transactionId + ", "
					+ (userId != null ? "userId=" + userId + ", " : "")
					+ (fromAC != null ? "fromAC=" + fromAC + ", " : "")
					+ (fromBankIFSC != null ? "fromBankIFSC=" + fromBankIFSC + ", " : "")
					+ (toAC != null ? "toAC=" + toAC + ", " : "")
					+ (toBankIFSC != null ? "toBankIFSC=" + toBankIFSC + ", " : "")
					+ (currency != null ? "currency=" + currency + ", " : "")
					+ (transactionDate != null ? "transactionDate=" + transactionDate + ", " : "")
					+ (transactionAmount != null ? "transactionAmount=" + transactionAmount + ", " : "")
					+ (transactionType != null ? "transactionType=" + transactionType + ", " : "")
					+ (transactionLocation != null ? "transactionLocation=" + transactionLocation : "") + "]";
		}
		
		
}