package com.learning.designmode.decoratorPattern;

/**
 * 装饰者的共同接口
 * @author Mr.Hu
 *
 */

public abstract class CondimentDecorator extends Beverage{
	
	/**
	 * 储存被装饰的组件对象
	 */
	protected Beverage beverage;
	
	/**
	 * 获取组件的描述
	 */
	public abstract String getDescription();
}
