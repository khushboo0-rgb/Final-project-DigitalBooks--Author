package com.author.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class Payment {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int paymentId;
	private String authorEmail;
	
	private int totalAmount;
	
	private Date dateOfPayment;
	private boolean amountRefunded;
	public int getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}
	public String getAuthorEmail() {
		return authorEmail;
	}
	public void setAuthorEmail(String authorEmail) {
		this.authorEmail = authorEmail;
	}
	public int getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(int totalAmount) {
		this.totalAmount = totalAmount;
	}
	public Date getDateOfPayment() {
		return dateOfPayment;
	}
	public void setDateOfPayment(Date dateOfPayment) {
		this.dateOfPayment = dateOfPayment;
	}
	public boolean isAmountRefunded() {
		return amountRefunded;
	}
	public void setAmountRefunded(boolean amountRefunded) {
		this.amountRefunded = amountRefunded;
	}
	@Override
	public String toString() {
		return "Payment [paymentId=" + paymentId + ", authorEmail=" + authorEmail + ", totalAmount=" + totalAmount
				+ ", dateOfPayment=" + dateOfPayment + ", amountRefunded=" + amountRefunded + "]";
	}
	public Payment(int paymentId, String authorEmail, int totalAmount, Date dateOfPayment, boolean amountRefunded) {
		super();
		this.paymentId = paymentId;
		this.authorEmail = authorEmail;
		this.totalAmount = totalAmount;
		this.dateOfPayment = dateOfPayment;
		this.amountRefunded = amountRefunded;
	}
	public Payment() {
		super();
	}
	
	
		
}