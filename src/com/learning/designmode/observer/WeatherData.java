package com.learning.designmode.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements SubjectInterface {
	
	private int data = 1; 
	private boolean changed = false;
	private List<ObserverInterface> list;
	
	WeatherData() {
		list = new ArrayList<ObserverInterface>();
	}
	
	@Override
	public void addObserver(ObserverInterface o) {
		list.add(o);
	}

	@Override
	public void removeObserver(ObserverInterface o) {
		int index = list.indexOf(o);
		
		list.remove(index);
		System.out.println(index+"  "+list.size());
		
	}

	@Override
	public void notifyObserver() {
		if(changed) {
			for(ObserverInterface o : list) {
				o.updata(data);
			}
			changed = false;
		}
	}

	@Override
	public void setChange() {
		changed = true;
	}
	
	public void setData(int data) {
		this.data = data;
		setChange();
		notifyObserver();
	}
}
