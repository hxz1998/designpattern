package com.learning.designmode.observer_new;

import org.junit.Test;

public class ObserverTest {
    @Test
    public void test() {
        NumberGenerator generator = new RandomNumberGenerator();
        Observer observer = new DigitObserver();
        Observer observer1 = new GraphObserver();
        generator.addObserver(observer);
        generator.addObserver(observer1);
        generator.execute();
    }
}
