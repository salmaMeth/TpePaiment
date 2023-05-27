package ecr.web.app.shared;

import java.io.Serializable;
import java.util.Date;

public class TransactionDataIn implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private String typepay;
	private int message=1;
	
	private long ref=1;
	private String amountlabel;
	private Date date;
	private long amount;
	public TransactionDataIn(long refer, long amount, int messageNum) {
		this.typepay = "SALE";
		this.message =messageNum+1;
		this.ref = ref+1;
		this.amountlabel = "Txn"+ref;
		this.amount = amount;
	}
	/**
	 * 
	 */
	public String getTypepay() {
		return typepay;
	}
	public void setTypepay(String typepay) {
		this.typepay = typepay;
	}
	public int getMessage() {
		return message;
	}
	public void setMessage(int message) {
		this.message = message;
	}
	public long getRef() {
		return ref;
	}
	public void setRef(long ref) {
		this.ref = ref;
	}
	public String getAmountlabel() {
		return amountlabel;
	}
	public void setAmountlabel(String amountlabel) {
		this.amountlabel = amountlabel;
	}
		public long getAmount() {
		return amount;
	}
	public void setAmount(long amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "TransactionDataIn [typepay=" + typepay + ", message=" + message
				+ ", ref=" + ref + ", amountlabel=" + amountlabel + ", date="
				+ date + ", amount=" + amount + "]";
	}
	public void setDate(Date date) {
		this.date = date;
	}

	public TransactionDataIn(){}


	
	
}
