package com.learning.designmode.simpleFactory;

public class CarFactory implements Factory {

	private static Car car;
	
	@Override
	public Movable getMovable() {
		car = new Car();
		return car;
	}

}
