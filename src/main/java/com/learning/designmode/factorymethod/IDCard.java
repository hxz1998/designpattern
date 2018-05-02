package com.learning.designmode.factorymethod;


import com.learning.designmode.factorymethod.framework.Product;

public class IDCard implements Product {

    private String name;

    public IDCard(String name) {
        this.name = name;
    }

    @Override
    public void use() {
        System.out.println("使用了 ： " + name + " 的卡片");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
