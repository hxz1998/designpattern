package com.learning.designmode.visitor;

public abstract class Entry implements Element {

    public abstract String getName();
    public abstract int getSize();

    public void add(Entry entry) throws FileTreatmentException {
        throw new FileTreatmentException("储存文件异常");
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+ "{"+ getName() + ":(" + getSize() +")"+"}";
    }

    @Override
    public abstract void accept(Visitor visitor);
}
