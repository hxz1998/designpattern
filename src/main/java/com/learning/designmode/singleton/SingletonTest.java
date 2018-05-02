package com.learning.designmode.singleton;

import org.junit.Test;

public class SingletonTest {
    @Test
    public void test() {
        Session session1 = Session.getInstance();
        Session session2 = Session.getInstance();
        if (session1 == session2) {
            System.out.println("两个对象是一个引用");
        } else {
            System.out.println("两个对象不是同一个引用");
        }
    }
}
