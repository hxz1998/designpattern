package com.learning.designmode.decorator;

import org.junit.Test;

public class DecoratorTest {
    @Test
    public void test() {
        Display d1 = new StringDisplay("HelloWorld");
        Display d2 = new SideBorder('#', new StringDisplay("HelloWorld"));
        Display d3 = new FullBorder(new StringDisplay("HelloWorld"));
        d1.show();
        d2.show();
        d3.show();

        Display d6 = new FullBorder(
                new SideBorder('*',
                        new FullBorder(
                        new StringDisplay("HelloWorld"))));
        d6.show();
    }
}
