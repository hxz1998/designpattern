package com.learning.designmode.strategy;

public class TravelByCar implements TravelStrategy {

	@Override
	public void travel() {
		System.out.println("Travel by car");
	}

}
