package com.learning.designmode.strategy;

public class TravelByAirplane implements TravelStrategy{
	
	@Override
	public void travel() {
		System.out.println("Travel By Ariplane");
	}
	
}
