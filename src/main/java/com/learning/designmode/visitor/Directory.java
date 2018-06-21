package com.learning.designmode.visitor;

import java.util.ArrayList;

public class Directory extends Entry {

    private String name;
    private int size;
    private ArrayList<Entry> directory = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        int size = 0;
        for (Entry entry : directory) {
            size += entry.getSize();
        }
        return size;
    }

    @Override
    public void add(Entry entry) {
        directory.add(entry);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public ArrayList<Entry> getDirectory() {
        return directory;
    }
}
