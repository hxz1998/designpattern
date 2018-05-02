package com.learning.designmode.factorymethod.framework;

public abstract class Creator {

    abstract protected Product createProduct(String name);
    abstract protected void registerProduct(Product product);

    public final Product create(String name) {
        Product p = createProduct(name);
        registerProduct(p);
        return p;
    }

}
