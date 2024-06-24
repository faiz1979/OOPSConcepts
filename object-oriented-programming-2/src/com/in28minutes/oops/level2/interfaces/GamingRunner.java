package com.in28minutes.oops.level2.interfaces;

public class GamingRunner {

	public static void main(String[] args) {
		
		MarioGame mario = new MarioGame();
		mario.up();
		mario.down();
		mario.left();
		mario.right();
		
		ChessGame chess = new ChessGame();
		
		chess.up();
		chess.down();
		chess.left();
		chess.right();

	}

}
