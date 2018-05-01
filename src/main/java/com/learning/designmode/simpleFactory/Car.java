package com.learning.designmode.simpleFactory;

public class Car implements Movable {

	@Override
	public void run() {
		System.out.println("冒着烟前进中Car...");
	}

}
