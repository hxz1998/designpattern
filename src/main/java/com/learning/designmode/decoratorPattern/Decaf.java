package com.learning.designmode.decoratorPattern;

/**
 * 具体的被装饰者实例
 * @author Mr.Hu
 *
 */

public class Decaf extends Beverage {

	Decaf() {
		description = "这是一杯没有咖啡因的咖啡--->";
	}
	
	@Override
	public double cost() {
		return 6.0;
	}

}
