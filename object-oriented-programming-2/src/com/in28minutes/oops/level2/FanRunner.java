package com.in28minutes.oops.level2;

public class FanRunner {

	public static void main(String[] args) {
		Fan fan = new Fan("Usha", 1200, "Brown");
		System.out.println(fan);
		fan.switchOn();
		System.out.println(fan);
		fan.setSpeed((byte)5);
		System.out.println(fan);
		fan.switchOff();
		System.out.println(fan);
		

	}

}
