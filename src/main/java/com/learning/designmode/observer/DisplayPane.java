package com.learning.designmode.observer;

public class DisplayPane implements ObserverInterface,DisplayInterface {
	
	private int data;
	private SubjectInterface subject;
	
	public DisplayPane(SubjectInterface subject) {
		data = 1;
		this.subject = subject;
		subject.addObserver(this);
		display();
	}
	
	@Override
	public void updata(int data) {
		this.data = data;
		display();
	}

	@Override
	public void display() {
		System.out.println("我是一个展示面板 , 我被通知主题发生了改变, 改变的数据是： " + data);
	}

	
}
