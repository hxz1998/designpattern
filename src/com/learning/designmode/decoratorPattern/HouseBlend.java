package com.learning.designmode.decoratorPattern;

/**
 * 具体的被装饰者实例
 * @author Mr.Hu
 *
 */

public class HouseBlend extends Beverage {
	
	HouseBlend() {
		description = "黑咖啡-->";
	}
	
	@Override
	public double cost() {
		return 1.0;
	}

}
