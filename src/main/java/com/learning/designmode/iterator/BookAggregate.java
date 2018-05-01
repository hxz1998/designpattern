package com.learning.designmode.iterator;

public class BookAggregate implements Aggregate{

    private Book[] books;
    private int index = 0;

    BookAggregate(int size) {
        books = new Book[size];
    }

    public void add(AggregateItem book) {
        books[index] = (Book) book;
        index++;
    }

    public Book getItemAt(int num) {
        return books[num];
    }

    public int getLength() {
        return books.length;
    }

    @Override
    public Iterator getIterator() {
        return new BookIterator(this);
    }
}
