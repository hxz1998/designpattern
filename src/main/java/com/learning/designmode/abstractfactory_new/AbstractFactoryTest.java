package com.learning.designmode.abstractfactory_new;

import com.learning.designmode.abstractfactory_new.factory.Factory;
import com.learning.designmode.abstractfactory_new.factory.Link;
import com.learning.designmode.abstractfactory_new.factory.Page;
import com.learning.designmode.abstractfactory_new.factory.Tray;
import org.junit.Test;

public class AbstractFactoryTest {
    @Test
    public void test() {
        Factory factory = Factory.getFactory("com.learning.designmode.abstractfactory_new.ListFactory");

        Link link = factory.createLink("百度", "http://baidu.com");

        Tray tray = factory.createTray("搜索");
        tray.add(link);

        Page page = factory.createPage("新页面", "小明");
        page.add(tray);

        page.output();
    }
}
