package com.dto;

public class OrderDto {
	String customerFirstName;
	String customerLastName;
	public String billingStreet;
	public String billingCity;

	public String getCustomerFirstName() {
		return customerFirstName;
	}

	public void setCustomerFirstName(String customerFirstName) {
		this.customerFirstName = customerFirstName;
	}

	public String getCustomerLastName() {
		return customerLastName;
	}

	public void setCustomerLastName(String customerLastName) {
		this.customerLastName = customerLastName;
	}

	public String getBillingStreet() {
		return billingStreet;
	}

	public void setBillingStreet(String billingStreet) {
		this.billingStreet = billingStreet;
	}

	public String getBillingCity() {
		return billingCity;
	}

	public void setBillingCity(String billingCity) {
		this.billingCity = billingCity;
	}

	@Override
	public String toString() {
		return "OrderDto [customerFirstName=" + customerFirstName + ", customerLastName=" + customerLastName
				+ ", billingStreet=" + billingStreet + ", billingCity=" + billingCity + "]";
	}
	

}
