package com.learning.designmode.bridge;

public class StringDisplayImpl extends DisplayImpl {

    @Override
    public void rawOpen() {
        System.out.println("open");
    }

    @Override
    public void rawClose() {
        System.out.println("close");
    }

    @Override
    public void rawPrint(String message) {
        System.out.println(message);
    }

    private void printLine(String content) {
        System.out.println("+" + content + "+");
    }
}
