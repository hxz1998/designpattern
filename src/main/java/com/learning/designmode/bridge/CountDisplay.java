package com.learning.designmode.bridge;

public class CountDisplay extends Display {

    public CountDisplay(DisplayImpl displayImpl, String message) {
        super(displayImpl, message);
    }

    public void multiDisplay(int count) {
        open();
        for (int i = 0; i < count; i++) {
            print();
        }
        close();
    }
}
