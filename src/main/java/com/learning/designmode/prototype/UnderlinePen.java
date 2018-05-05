package com.learning.designmode.prototype;

public class UnderlinePen extends Product {

    public UnderlinePen(char txt) {
        super(txt);
    }

    @Override
    public void use(String message) {
        int length = message.length();
        System.out.println(message);
        for(int i = 0;i < length; i++) {
            System.out.print(txt);
        }
    }
}
