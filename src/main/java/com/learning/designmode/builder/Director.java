package com.learning.designmode.builder;

public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void construct() {
        builder.open("data");
        builder.makeTitle("你好，世界");
        builder.makeContent("这是一个阳光明媚的早晨");
        builder.close();
    }
}
