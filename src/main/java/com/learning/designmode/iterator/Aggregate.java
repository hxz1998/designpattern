package com.learning.designmode.iterator;

public interface Aggregate {
    Iterator getIterator();
    int getLength();
    AggregateItem getItemAt(int num);
    void add(AggregateItem item);
}
