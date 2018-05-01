package com.learning.designmode.abstractFactory;

public class FactoryProducer {
	
	private final static AbstractFactory factory = null;
	
	public static AbstractFactory getFactory(FactoryType type) {
		if(type == FactoryType.COLORFACTORY) {
			return new ColorFactory();
		} else if(type == FactoryType.SHAPEFACTORY) {
			return new ShapeFactory();
		}
		return null;
	}
	
}
