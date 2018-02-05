package com.learning.designmode.abstractFactory;

public class ColorFactory extends AbstractFactory {

	@Override
	public Shape getShape(ShapeType type) {
		return null;
	}

	@Override
	public Color getColor(ColorType type) {
		if(type == ColorType.GREEN) {
			return new Green();
		}else if(type == ColorType.RED){
			return new Red();
		} else {
			return null;
		}
	}

}
