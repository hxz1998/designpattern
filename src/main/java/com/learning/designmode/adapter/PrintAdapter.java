package com.learning.designmode.adapter;

public class PrintAdapter extends Banner implements TargetPrint{
    @Override
    public void printMessageWeak(String message) {
        showMessageWeak("《" + message + "》");
    }

    @Override
    public void printMessageStrong(String message) {
        showMessageStrong("-" + message + "-");
    }
}
