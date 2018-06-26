package com.learning.designmode.proxy;

import org.junit.Test;

public class ProxyTest {
    @Test
    public void test() {
        Printable printable = new PrintProxy();
        printable.setPrinterName("alice");
        System.out.println("现在的名字是：" + printable.getPrinterName());
        printable.setPrinterName("bob");
        System.out.println("现在的名字是：" + printable.getPrinterName());
        printable.print("HelloWorld");
    }
}
