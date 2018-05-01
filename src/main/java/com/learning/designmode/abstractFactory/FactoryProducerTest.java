package com.learning.designmode.abstractFactory;

import static org.junit.Assert.*;

import org.junit.Test;

public class FactoryProducerTest {

	@Test
	public void testGetFactory() {
		AbstractFactory f1 = FactoryProducer.getFactory(FactoryType.SHAPEFACTORY);
		AbstractFactory f2 = FactoryProducer.getFactory(FactoryType.SHAPEFACTORY);
		AbstractFactory f6 = FactoryProducer.getFactory(FactoryType.COLORFACTORY);
		f1.getShape(ShapeType.CIRCLE).draw();
		f2.getShape(ShapeType.RECT).draw();
		f6.getColor(ColorType.GREEN).fill();
	}

}
