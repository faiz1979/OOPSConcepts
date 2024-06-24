package com.in28minutes.oops.level2.abstraction;

public class TrafficRulesImplementationKarnataka extends GlobalTrafficRules {

	@Override
	public void signal() {
		
		System.out.println("\nThis is new implementation for Karnataka State");
		System.out.println("Green light is GO");
		System.out.println("Yellow light is SLOW DOWN");
		System.out.println("Red light is STOP");
		
	}

	@Override
	public void speedLimit() {
		
		System.out.println("Speed Limit on Expressway is 120kmph");
		System.out.println("Speed Limit on National Highway is 100 kmph");
		System.out.println("Speed Limit on State Highway is 80 kmph");
		System.out.println("Speed Limit on City Roads is 40 kmph");


		
	}

	@Override
	public void zebraCrossing() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void signBoards() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void licenseToDrive() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void totalWeightToLoad() {
		// TODO Auto-generated method stub
		
	}

}
