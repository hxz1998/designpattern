package com.learning.designmode.abstractFactory;

public abstract class AbstractFactory {
	
	public abstract Shape getShape(ShapeType type);
	public abstract Color getColor(ColorType type);

}
