package com.learning.designmode.simpleFactory;

public class AirplaneFactory implements Factory {

	private static Airplane airplane;
	
	@Override
	public Movable getMovable() {
		airplane = new Airplane();
		return airplane;
	}

}
