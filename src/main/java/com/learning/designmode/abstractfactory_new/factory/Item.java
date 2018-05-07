package com.learning.designmode.abstractfactory_new.factory;

public abstract class Item {
    protected String caption;

    public Item(String caption) {
        this.caption = caption;
    }

    public abstract String makeHTML(String message);
}
