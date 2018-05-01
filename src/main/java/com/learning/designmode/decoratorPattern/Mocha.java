package com.learning.designmode.decoratorPattern;

/**
 * 调料的具体实现
 * @author Mr.Hu
 *
 */

public class Mocha extends CondimentDecorator {

	Mocha(Beverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return "摩卡+" + beverage.getDescription();
	}

	@Override
	public double cost() {
		return 0.6 + beverage.cost();
	}
	
}
