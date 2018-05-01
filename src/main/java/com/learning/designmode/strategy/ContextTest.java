package com.learning.designmode.strategy;

import static org.junit.Assert.*;

import org.junit.Test;

public class ContextTest {

	@Test
	public void test() {
		Context person = new Context(new TravelByCar());
		person.go();
		
		person.setTravelStrategy(new TravelByAirplane());
		person.go();
	}

}
