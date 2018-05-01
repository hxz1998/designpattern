package com.learning.designmode.observer.useJDK;

import java.util.Observable;
import java.util.Observer;

import com.learning.designmode.observer.DisplayInterface;

public class DisplayPane implements DisplayInterface, Observer {

	private Observable sub;
	private int data;
	
	public DisplayPane(Observable sub) {
		this.sub = sub;
		sub.addObserver(this);
	}
	
	@Override
	public void display() {
		System.out.println("数据改变了， 现在获得的数据是 " + data);
	}

	@Override
	public void update(Observable o, Object arg) {
		data = (Integer)arg;
		display();
	}

}
