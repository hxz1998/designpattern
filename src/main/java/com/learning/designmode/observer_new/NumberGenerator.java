package com.learning.designmode.observer_new;

import java.util.ArrayList;
import java.util.List;

public abstract class NumberGenerator {
    protected List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

    public abstract void execute();

    public abstract int getNumber();
}
