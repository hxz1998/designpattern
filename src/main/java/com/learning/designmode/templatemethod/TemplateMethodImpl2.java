package com.learning.designmode.templatemethod;

public class TemplateMethodImpl2 extends TemplateMethod {

    private String message;

    public TemplateMethodImpl2(String message) {
        super(message);
        this.message = message;
    }

    @Override
    protected void open() {
        System.out.println(getClass().getName() + "open");
    }

    @Override
    protected void close() {
        System.out.println(getClass().getName() + "close");
    }

    @Override
    protected void print() {
        System.out.println(getClass().getName() + " : " + message);
    }
}
