package com.cts.demo;

import java.math.BigDecimal;

public class CurrencyConversionBean {
	private String from;
	private String to;
	private BigDecimal conversionRate;
	private BigDecimal quantity;
	private BigDecimal totalAmount;
	private int port;
	public CurrencyConversionBean() {
		
	}
	public CurrencyConversionBean(String from, String to, BigDecimal conversionRate, BigDecimal quantity,
			BigDecimal totalAmount, int port) {
		super();
		this.from = from;
		this.to = to;
		this.conversionRate = conversionRate;
		this.quantity = quantity;
		this.totalAmount = totalAmount;
		this.port = port;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public BigDecimal getConversionRate() {
		return conversionRate;
	}
	public void setConversionRate(BigDecimal conversionRate) {
		this.conversionRate = conversionRate;
	}
	public BigDecimal getQuantity() {
		return quantity;
	}
	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}
	public BigDecimal getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(BigDecimal totalAmount) {
		this.totalAmount = totalAmount;
	}
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
	
	

}
