package com.learning.designmode.simpleFactory;

import static org.junit.Assert.*;

import org.junit.Test;

public class MovableTest {

	@Test
	public void test() {
		Factory factory = new CarFactory();
//		Factory factory = new AirplaneFactory();
		Movable movable = factory.getMovable();
		movable.run();
	}

}
