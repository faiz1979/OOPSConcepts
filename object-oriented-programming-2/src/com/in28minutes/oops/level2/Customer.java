package com.in28minutes.oops.level2;

public class Customer {
	
	private String name;
	private Address homeAddress;
	private Address workAddress;
	private Address shopAddress;
	
	public Customer(String name, Address homeAddress)
	{
		this.name = name;
		this.homeAddress = homeAddress;
	}

	public Address getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}

	public Address getWorkAddress() {
		return workAddress;
	}

	public void setWorkAddress(Address workAddress) {
		this.workAddress = workAddress;
	}
	
	
	public Address getShopAddress() {
		return shopAddress;
	}

	public void setShopAddress(Address shopAddress) {
		this.shopAddress = shopAddress;
	}

	
	public String toString()
	{
		
		return String.format("Name - [%s], Home address - [%s], Work address - [%s], Shop address - [%s]", name, homeAddress, workAddress, shopAddress);
	}
}
