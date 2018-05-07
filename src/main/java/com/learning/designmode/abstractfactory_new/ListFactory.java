package com.learning.designmode.abstractfactory_new;

import com.learning.designmode.abstractfactory_new.factory.Factory;
import com.learning.designmode.abstractfactory_new.factory.Link;
import com.learning.designmode.abstractfactory_new.factory.Page;
import com.learning.designmode.abstractfactory_new.factory.Tray;

public class ListFactory extends Factory {

    @Override
    public Link createLink(String caption, String url) {
        return new ListLink(caption, url);
    }

    @Override
    public Tray createTray(String caption) {
        return new ListTray(caption);
    }

    @Override
    public Page createPage(String title, String author) {
        return new ListPage(title, author);
    }
}
