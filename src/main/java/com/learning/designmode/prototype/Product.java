package com.learning.designmode.prototype;

public abstract class Product implements Cloneable {
    protected char txt;
    public Product(char txt) {
        this.txt = txt;
    }
    public abstract void use(String message);
    public Product createClone() {
        Product product = null;
        try {
            product = (Product) clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return product;
    }
}
