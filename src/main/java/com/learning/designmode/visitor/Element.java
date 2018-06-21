package com.learning.designmode.visitor;

public interface Element {
    void accept(Visitor visitor);
}
