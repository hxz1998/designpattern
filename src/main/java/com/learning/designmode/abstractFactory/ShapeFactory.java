package com.learning.designmode.abstractFactory;

public class ShapeFactory extends AbstractFactory {

	@Override
	public Shape getShape(ShapeType type) {
		if(type == ShapeType.CIRCLE) {
			return new Circle();
		} else if(type == ShapeType.RECT) {
			return new Rectangle();
		} else {
			return null;
		}
	}

	@Override
	public Color getColor(ColorType type) {
		return null;
	}

}
