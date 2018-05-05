package com.learning.designmode.builder;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class TextBuilder implements Builder {

    private StringBuffer stringBuffer;
    private PrintWriter writer = null;

    @Override
    public void open(String filename) {
        try {
            File file = new File("src/main/resources/" + filename + ".dat");
            writer = new PrintWriter(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void makeTitle(String title) {
        writer.write("标题：" + title + "\n");
    }

    @Override
    public void makeContent(String content) {
        writer.write("|内容：" + content + "\n");
    }

    @Override
    public void close() {
        writer.flush();
        writer.close();
        System.out.println("文件写完");
    }
}
