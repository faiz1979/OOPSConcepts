package com.in28minutes.oops.level2;

public class CustomerRunner {

	public static void main(String[] args) {
		
		Address homeAddress = new Address("Gulmohar Apartment Tingrenagar", "Pune", 411032);
		System.out.println(homeAddress);
		Customer customer = new Customer("Faiz Mujawar", homeAddress);
		System.out.println(customer);
		
		Address workAddress = new Address("Cybage, Kalyaninagar", "Pune", 411016);
		customer.setWorkAddress(workAddress);
		System.out.println(customer);
		
		Address shopAddress = new Address("Aasara, 297 - E Ward, New Shahupuri, Baker Galli", "Kolhapur", 416003);
		customer.setShopAddress(shopAddress);
		System.out.println(customer);

	}

}
