package com.learning.designmode.bridge;

import org.junit.Test;

public class Main {

    Display display1 = new Display(new StringDisplayImpl(), "HelloWorld");
    Display display2 = new CountDisplay(new StringDisplayImpl(), "Hello");
    CountDisplay countDisplay = new CountDisplay(new StringDisplayImpl(), "你好世界");

    @Test
    public void test() {
        display1.display();
        display2.display();
        countDisplay.multiDisplay(6);
    }
}
