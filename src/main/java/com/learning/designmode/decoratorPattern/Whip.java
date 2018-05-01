package com.learning.designmode.decoratorPattern;

/**
 * 调料的具体实现
 * @author Mr.Hu
 *
 */

public class Whip extends CondimentDecorator {

	Whip(Beverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return "奶油+" + beverage.getDescription();
	}

	@Override
	public double cost() {
		return 0.65 + beverage.cost();
	}

}
