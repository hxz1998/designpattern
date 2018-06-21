package com.learning.designmode.chainofresponsibility;

import org.junit.Test;

public class ChainOfResponsibilityTest {

    @Test
    public void test() {
        Support alice = new NoSupport("alice");
        Support bob = new LimitSupport("bob", 100);
        Support charlie = new SpecialSupport("charlie", 300);
        Support diana = new OddSupport("diana");

        alice.setNext(bob).setNext(charlie).setNext(diana);

        for (int i = 0; i < 500; i += 3) {
            alice.support(new Trouble(i));
        }
    }

}
