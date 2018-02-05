package com.learning.designmode.strategy;

public class Context {
	private TravelStrategy mode;
	
	Context(TravelStrategy mode) {
		this.mode = mode;
	}
	
	public void setTravelStrategy(TravelStrategy mode) {
		this.mode = mode;
	}
	
	public void go() {
		mode.travel();
	}
}
