package com.learning.designmode.factorymethod;

import org.junit.Test;

public class FactoryMethodTest {
    @Test
    public void test() {
        IDCardFactory factory = new IDCardFactory();
        IDCard card1 = (IDCard) factory.create("小明");
        IDCard card2 = (IDCard) factory.create("小红");
        card1.use();
        card2.use();
    }
}
