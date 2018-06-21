package com.learning.designmode.visitor;

public class File extends Entry {

    private String filename;
    private int size;

    public File(String filename, int size) {
        this.filename = filename;
        this.size = size;
    }

    @Override
    public String getName() {
        return filename;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
