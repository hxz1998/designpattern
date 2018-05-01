package com.learning.designmode.iterator;

import org.junit.Test;

public class IteratorTest {
    @Test
    public void test() {
        Iterator iterator;
        Aggregate bookAggergate = new BookAggregate(3);
        iterator = new BookIterator(bookAggergate);
        bookAggergate.add(new Book("A"));
        bookAggergate.add(new Book("B"));
        bookAggergate.add(new Book("c"));
        while(iterator.hasNext()) {
            System.out.println(((Book)iterator.next()).getName());
        }
    }
}
