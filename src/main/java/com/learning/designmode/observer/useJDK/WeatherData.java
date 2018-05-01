package com.learning.designmode.observer.useJDK;

import java.util.Observable;
import java.util.Observer;

public class WeatherData extends Observable {

	private int data;
	
	public void setData(int data) {
		this.data = data;
		setChanged();
		notifyObservers();
	}
	
	@Override
	public synchronized void addObserver(Observer arg0) {
		System.out.println("添加进来一个观察者~ 目前观察者数目 : " + countObservers() );
		super.addObserver(arg0);
	}

	@Override
	protected synchronized void clearChanged() {
		System.out.println("更改已经被改变了， 但是我们确认");
		super.clearChanged();
	}

	@Override
	public synchronized void deleteObserver(Observer arg0) {
		System.out.println("删除掉一个观察者~ 目前观察者数目 : " + countObservers() );
		super.deleteObserver(arg0);
	}

	@Override
	public void notifyObservers() {
		System.out.println("将要通知他们了");
		super.notifyObservers(data);
	}

	@Override
	protected synchronized void setChanged() {
		System.out.println("已经发生了改变");
		super.setChanged();
	}
	
}
