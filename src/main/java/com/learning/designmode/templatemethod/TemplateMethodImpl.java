package com.learning.designmode.templatemethod;

public class TemplateMethodImpl extends TemplateMethod {
    private String message;

    public TemplateMethodImpl(String message) {
        super(message);
        this.message = message;
    }

    @Override
    protected void open() {
        System.out.println(getClass().getName() + " open");
    }

    @Override
    protected void close() {
        System.out.println(getClass().getName() + " close");
    }

    @Override
    protected void print() {
        System.out.println(getClass().getName() + " : " + message);
    }
}
