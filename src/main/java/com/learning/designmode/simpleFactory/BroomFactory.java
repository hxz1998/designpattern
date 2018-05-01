package com.learning.designmode.simpleFactory;

public class BroomFactory implements Factory {

	private static Broom broom;
	
	@Override
	public Movable getMovable() {
		broom = new Broom();
		return broom;
	}

}
