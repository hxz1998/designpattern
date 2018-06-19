package com.learning.designmode.bridge;

public class Display {

    private DisplayImpl displayImpl;
    protected String message;

    public Display(DisplayImpl displayImpl, String message) {
        this.message = message;
        this.displayImpl = displayImpl;
    }

    public void open() {
        displayImpl.rawOpen();
    }

    public void close() {
        displayImpl.rawClose();
    }

    public void print() {
        displayImpl.rawPrint(message);
    }

    public final void display() {
        open();
        print();
        close();
    }
}
