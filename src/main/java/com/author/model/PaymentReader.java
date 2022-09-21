package com.author.model;

import java.util.Date;

public class PaymentReader {
	
	private String image;
	private String title;
	private int price;
	
	private int paymentId;
	private int totalAmount;
	private int quantity;
	private Date dateOfPayment;
	private boolean amountRefunded;
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}
	public int getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(int totalAmount) {
		this.totalAmount = totalAmount;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
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
	public PaymentReader(String image, String title, int price, int paymentId, int totalAmount, int quantity,
			Date dateOfPayment, boolean amountRefunded) {
		super();
		this.image = image;
		this.title = title;
		this.price = price;
		this.paymentId = paymentId;
		this.totalAmount = totalAmount;
		this.quantity = quantity;
		this.dateOfPayment = dateOfPayment;
		this.amountRefunded = amountRefunded;
	}
	public PaymentReader() {
		super();
	}
	@Override
	public String toString() {
		return "PaymentReader [image=" + image + ", title=" + title + ", price=" + price + ", paymentId=" + paymentId
				+ ", totalAmount=" + totalAmount + ", quantity=" + quantity + ", dateOfPayment=" + dateOfPayment
				+ ", amountRefunded=" + amountRefunded + "]";
	}
	
	
	
}