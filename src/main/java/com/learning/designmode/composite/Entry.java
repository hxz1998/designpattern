package com.learning.designmode.composite;

public abstract class Entry {

    public abstract String getName();
    public abstract int getSize();

    public void printList() {
        printList("");
    }

    protected abstract void printList(String prefix);

    public void add(Entry entry) throws FileTreatmentException{
        throw new FileTreatmentException("储存文件异常");
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+ "{"+ getName() + ":(" + getSize() +")"+"}";
    }
}
