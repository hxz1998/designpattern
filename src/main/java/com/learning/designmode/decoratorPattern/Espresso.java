package com.learning.designmode.decoratorPattern;

/**
 * 具体的被装饰者实例
 * @author Mr.Hu
 *
 */

public class Espresso extends Beverage {

	Espresso() {
		description = "这是一杯浓咖啡--->";
	}
	
	@Override
	public double cost() {
		return 3.0;
	}

}
