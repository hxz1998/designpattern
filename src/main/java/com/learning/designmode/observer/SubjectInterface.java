package com.learning.designmode.observer;

public interface SubjectInterface {
	public void addObserver(ObserverInterface o);
	public void removeObserver(ObserverInterface o);
	public void notifyObserver();
	public void setChange();
}
