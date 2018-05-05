package com.learning.designmode.prototype;

public class MessageBox extends Product {

    public MessageBox(char txt) {
        super(txt);
    }

    @Override
    public void use(String message) {
        int length = message.length();
        for (int i = 0;i < length;i++) {
            System.out.print(txt);
        }
        System.out.println("\n" + txt + message + txt);
        for (int i =0;i < length;i++) {
            System.out.print(txt);
        }
    }
}
