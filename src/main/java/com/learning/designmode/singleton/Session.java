package com.learning.designmode.singleton;

public class Session {

    private static Session session = new Session();

    private Session(){}
    public static Session getInstance() {
        return session;
    }
}
