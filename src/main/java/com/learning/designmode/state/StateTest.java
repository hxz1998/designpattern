package com.learning.designmode.state;

import org.junit.Test;

public class StateTest {

    public static void main(String[] args) {
        test();
    }

    public static void test() {
        SafeFrame safeFrame = new SafeFrame("测试");
        while (true) {
            for (int i = 0; i < 24; i++) {
                safeFrame.setClock(i);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
