package com.learning.designmode.abstractfactory_new.factory;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public abstract class Page {

    protected String title;
    protected String author;
    protected List<Item> content = new ArrayList<>();

    public Page(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void add(Item item) {
        content.add(item);
    }

    public void output() {
        try {
            String filename = title + ".html";
            PrintWriter writer = new PrintWriter(new File("src/main/resources/" + filename));
            writer.write(makeHTML());
            writer.flush();
            writer.close();
            System.out.println(filename + "编写完成");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public abstract String makeHTML();
}
