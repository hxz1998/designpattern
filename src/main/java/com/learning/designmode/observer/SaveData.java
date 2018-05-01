package com.learning.designmode.observer;

public class SaveData implements ObserverInterface, DisplayInterface {

	private int data;
	private SubjectInterface subject;
	
	public SaveData(SubjectInterface subject) {
		data = 1;
		this.subject = subject;
		subject.addObserver(this);
		display();
	}
	
	@Override
	public void display() {
		System.out.println("我是数据储存模块， 我被通知发生了改变， 改变的数据是 ： " + data);
	}

	@Override
	public void updata(int data) {
		this.data = data;
		display();
	}

}
