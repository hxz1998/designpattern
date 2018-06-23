package com.learning.designmode.observer_new;

import java.util.Random;

public class RandomNumberGenerator extends NumberGenerator {

    private Random random = new Random();
    private int number;

    @Override
    public void execute() {
        for (int i = 0;i < 100; i++) {
            number = random.nextInt(50);
            notifyAllObservers();
        }
    }

    @Override
    public int getNumber() {
        return number;
    }
}
