package com.learning.designmode.observer.useJDK;

import static org.junit.Assert.*;

import org.junit.Test;

public class DisplayPaneTest {

	@Test
	public void test() {
		WeatherData weatherData = new WeatherData();
		DisplayPane displayPane = new DisplayPane(weatherData);
		weatherData.setData(12);
	}

}
