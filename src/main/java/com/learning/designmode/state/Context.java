package com.learning.designmode.state;

public interface Context {
    void setClock(int clock);
    void changeState(State state);
    void callSecurityCenter(String message);
    void recordLog(String message);
}
