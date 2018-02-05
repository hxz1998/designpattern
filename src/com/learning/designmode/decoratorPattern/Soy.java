package com.learning.designmode.decoratorPattern;

/**
 * 调料的具体实现
 * @author Mr.Hu
 *
 */

public class Soy extends CondimentDecorator {
	
	Soy(Beverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return "豆浆+" + beverage.getDescription();
	}

	@Override
	public double cost() {
		return 0.2 + beverage.cost();
	}

}
