package com.learning.designmode.decoratorPattern;

/**
 * 调料的具体实现
 * @author Mr.Hu
 *
 */

public class Milk extends CondimentDecorator {

	Milk(Beverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return "牛奶+" + beverage.getDescription();
	}

	@Override
	public double cost() {
		return 0.5 + beverage.cost();
	}

}
