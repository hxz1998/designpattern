package com.learning.designmode.visitor;

public class ListVisitor extends Visitor {

    private String currentDir = "";

    @Override
    public void visit(File file) {
        System.out.println(currentDir + "/" + file);
    }

    @Override
    public void visit(Directory directory) {
        System.out.println(currentDir + "/" + directory);
        String saveDir = currentDir;
        currentDir = currentDir + "/" + directory.getName();

        for (Entry entry : directory.getDirectory()) {
            entry.accept(this);
        }

        currentDir = saveDir;
    }
}
