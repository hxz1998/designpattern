package com.learning.designmode.abstractfactory_new;

import com.learning.designmode.abstractfactory_new.factory.Item;
import com.learning.designmode.abstractfactory_new.factory.Page;

public class ListPage extends Page {

    public ListPage(String title, String author) {
        super(title, author);
    }

    @Override
    public String makeHTML() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("<html><head><title> " + title + "</title></head><body>");
        for(Item item : content) {
            stringBuilder.append(item.makeHTML(null));
        }
        stringBuilder.append("<hr><address>" + author + "</address>");
        stringBuilder.append("</body></html>");
        return stringBuilder.toString();
    }
}
