package com.learning.designmode.flyweight;

import org.junit.Test;

public class FlyWeightTest {

    @Test
    public void test() {
        BigString bigString = new BigString("123456");
        bigString.print();
    }
}
