package com.learning.designmode.builder;

public interface Builder {
    void open(String filename);
    void makeTitle(String title);
    void makeContent(String content);
    void close();
}
