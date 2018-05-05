package com.learning.designmode.prototype;

import org.junit.Test;

public class PrototypeTest {
    @Test
    public void test() {
        Manager manager = new Manager();
        MessageBox messageBox1 = new MessageBox('*');
        manager.register("星星", messageBox1);
        MessageBox messageBox2 = new MessageBox('~');
        manager.register("波浪", messageBox2);
        UnderlinePen underlinePen = new UnderlinePen('-');
        manager.register("下划线", underlinePen);

        Product product = manager.create("下划线");
        product.use("你好世界");

        Product product1 = manager.create("星星");
        product1.use("Hello World");

        //下面这个不存在，应该定义一个自定义异常来增强程序健壮性
        Product product2 = manager.create("不存在的");
        product2.use("不存在的");
    }
}
