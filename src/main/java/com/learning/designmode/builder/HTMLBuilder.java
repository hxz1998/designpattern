package com.learning.designmode.builder;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class HTMLBuilder implements Builder {

    private PrintWriter writer = null;

    @Override
    public void open(String filename) {
        try {
            File file = new File("src/main/resources/" + filename + ".html");
            writer = new PrintWriter(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void makeTitle(String title) {
        writer.write("<h1>" + title + "</h1>");
    }

    @Override
    public void makeContent(String content) {
        writer.write("<p>" + content + "</p>");
    }

    @Override
    public void close() {
        writer.flush();
        writer.close();
        System.out.println("文件写完");
    }
}
