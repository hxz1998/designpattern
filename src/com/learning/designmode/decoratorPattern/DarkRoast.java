package com.learning.designmode.decoratorPattern;

/**
 * 具体的被装饰者实例
 * @author Mr.Hu
 *
 */

public class DarkRoast extends Beverage {

	DarkRoast() {
		description = "深焙咖啡--->";
	}
	
	@Override
	public double cost() {
		return 2.0;
	}

}
