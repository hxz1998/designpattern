package com.learning.designmode.abstractfactory_new;

import com.learning.designmode.abstractfactory_new.factory.Item;
import com.learning.designmode.abstractfactory_new.factory.Tray;

public class ListTray extends Tray {

    public ListTray(String caption) {
        super(caption);
    }

    @Override
    public String makeHTML(String message) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("<li>");
        stringBuilder.append("<ul>");

        for(Item item : tray) {
            stringBuilder.append(item.makeHTML(null));
        }

        stringBuilder.append("</ul>");
        stringBuilder.append("</li>");
        return stringBuilder.toString();
    }
}
