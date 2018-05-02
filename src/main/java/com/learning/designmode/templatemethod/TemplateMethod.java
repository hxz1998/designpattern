package com.learning.designmode.templatemethod;

public abstract class TemplateMethod {
    private String message;

    public TemplateMethod(String message) {
        this.message = message;
    }

    protected abstract void open();
    protected abstract void close();
    protected abstract void print();
    public final void doPrint() {
        open();
        for(int i = 0;i < 5;i++) {
            print();
        }
        close();
    }
}
