package com.learning.designmode.bridge;

public abstract class DisplayImpl {
    public abstract void rawOpen();
    public abstract void rawClose();
    public abstract void rawPrint(String message);
}
