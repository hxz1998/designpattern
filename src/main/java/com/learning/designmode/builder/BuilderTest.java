package com.learning.designmode.builder;

import org.junit.Test;

public class BuilderTest {
    @Test
    public void test() {
        HTMLBuilder builder1 = new HTMLBuilder();
        Director director = new Director(builder1);
        director.construct();
        TextBuilder builder2 = new TextBuilder();
        director = new Director(builder2);
        director.construct();
    }
}
