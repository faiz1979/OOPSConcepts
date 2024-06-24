package com.in28minutes.oops.level2.interfaces;

public class ChessGame implements GamingConsole {

	@Override
	public void up() {
		System.out.println("\nThis is the implementation for Chess Game");
		System.out.println("Move ahead");
		
	}

	@Override
	public void down() {
		System.out.println("Move back");
		
	}

	@Override
	public void left() {
		
		System.out.println("Move left");
		
	}

	@Override
	public void right() {
		System.out.println("Move right");
		
	}

}
