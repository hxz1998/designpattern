package com.learning.designmode.adapter;

import org.junit.Test;

public class AdapterTest {
    @Test
    public void test() {
        //假设系统只能使用TargetPrint的接口
        TargetPrint targetPrint = new PrintAdapter();
        targetPrint.printMessageStrong("HelloWorld");
        targetPrint.printMessageWeak("HelloWorld");
    }
}
