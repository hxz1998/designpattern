package com.learning.designmode.iterator;

public class BookIterator implements Iterator<AggregateItem> {

    private Aggregate bookAggregate;
    private int index = 0;
    private int size;

    public BookIterator(Aggregate bookAggregate) {
        this.bookAggregate = bookAggregate;
        size = bookAggregate.getLength();
    }

    @Override
    public boolean hasNext() {
        if (index >= size) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public AggregateItem next() {
        AggregateItem aggregateItem = bookAggregate.getItemAt(index);
        index++;
        return aggregateItem;
    }
}
