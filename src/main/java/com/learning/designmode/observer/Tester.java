package com.learning.designmode.observer;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Test;

public class Tester {

	@Test
	public void test() {
		WeatherData weatherData = new WeatherData();
		DisplayPane displayPane = new DisplayPane(weatherData);
		SaveData saveData = new SaveData(weatherData);
		SharePane sharePane = new SharePane(weatherData);
		weatherData.setData(2);
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		weatherData.setData(input);
		weatherData.setData(2);
	}

}
