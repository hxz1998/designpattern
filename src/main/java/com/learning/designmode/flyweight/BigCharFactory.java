package com.learning.designmode.flyweight;

import java.util.HashMap;

public class BigCharFactory {

    private static BigCharFactory bigCharFactory = new BigCharFactory();
    private HashMap<String, BigChar> pool = new HashMap<>();

    private BigCharFactory() {}

    public static BigCharFactory getInstance() {
        return bigCharFactory;
    }

    public BigChar getBigChar(char charname) {
        BigChar bigChar;
        if (pool.get(charname+"") == null) {
            bigChar = new BigChar(charname);
            pool.put(charname+"", bigChar);
        } else {
            bigChar = pool.get(charname + "");
        }
        return bigChar;
    }
}
