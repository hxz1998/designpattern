package com.learning.designmode.observer;

public class SharePane implements DisplayInterface, ObserverInterface {
	
	private SubjectInterface subject;
	private int data;
	
	public SharePane(SubjectInterface subject) {
		this.subject = subject;
		subject.addObserver(this);
	}
	
	@Override
	public void updata(int data) {
		this.data = data;
		display();
	}

	@Override
	public void display() {
		System.out.println("改变了一次， 但是现在不用再通知了！");
		subject.removeObserver(this);
	}

}
