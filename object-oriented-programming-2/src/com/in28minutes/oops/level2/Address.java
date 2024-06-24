package com.in28minutes.oops.level2;

public class Address {
	
	private String line1;
	private String city;
	private int zipcode;
	

	public Address (String line1, String city, int zipcode)
	{
		super();
		this.line1 = line1;
		this.city = city;
		this.zipcode = zipcode;
	}
	
	public String toString()
	
	{
		return (line1 + " " + city + " " + zipcode);
	}

}
