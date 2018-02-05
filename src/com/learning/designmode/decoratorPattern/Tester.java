package com.learning.designmode.decoratorPattern;

import static org.junit.Assert.*;

import org.junit.Test;

public class Tester {

	@Test
	public void test() {
		Beverage base = new HouseBlend();
		base = new Milk(base);
		base = new Soy(base);
		base = new Mocha(base);
		System.out.println("您要的是：" + base.getDescription() + "\n共用 ：" + base.cost());
	}

}
