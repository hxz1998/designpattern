package com.learning.designmode.decoratorPattern;

/**
 * 装饰者的最根上的那个组件，------>Component类
 * 
 * 使用的是咖啡实例
 * 
 * @author Mr.Hu 
 *
 */

public abstract class Beverage {
	
	protected String description;
	
	Beverage() {
		description = "简简单单的饮料--->";
	}
	
	public String getDescription() {
		return description;
	}
	
	public abstract double cost();



}
