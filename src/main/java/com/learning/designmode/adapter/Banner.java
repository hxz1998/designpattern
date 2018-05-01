package com.learning.designmode.adapter;

public class Banner {
    public void showMessageWeak(String message) {
        System.out.println("<" + message + ">");
    }
    public void showMessageStrong(String message) {
        System.out.println("*" + message + "*");
    }
}
