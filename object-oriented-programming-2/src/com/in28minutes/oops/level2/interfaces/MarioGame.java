package com.in28minutes.oops.level2.interfaces;

public class MarioGame implements GamingConsole {

	@Override
	public void up() {
		System.out.println("\nThis is the implementation for Mario Game");
		System.out.println("Jumps");
		
	}

	@Override
	public void down() {
		System.out.println("Does a squat - chuckling");
		
	}

	@Override
	public void left() {
		
		System.out.println("Moves backwards");
		
	}

	@Override
	public void right() {
		System.out.println("Moves forward");
		
	}

}
