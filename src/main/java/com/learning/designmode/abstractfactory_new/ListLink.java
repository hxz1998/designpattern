package com.learning.designmode.abstractfactory_new;

import com.learning.designmode.abstractfactory_new.factory.Link;

public class ListLink extends Link {

    public ListLink(String caption, String url) {
        super(caption, url);
    }

    @Override
    public String makeHTML(String message) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("<li><a href = \"" + url + "\">" + caption + "</a></li>");
        return stringBuilder.toString();
    }
}
