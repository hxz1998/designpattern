package com.learning.designmode.chainofresponsibility;

public abstract class Support {
    private String name;
    private Support next;

    public Support(String name) {
        this.name = name;
    }

    public final void support(Trouble trouble) {
        if (resolve(trouble)) {
            done(trouble);
        } else if (next != null) {
            next.support(trouble);
        } else {
            fail(trouble);
        }
    }

    protected abstract boolean resolve(Trouble trouble);

    public Support setNext(Support support) {
        this.next = support;
        return support;
    }

    private void done(Trouble trouble) {
        System.out.println(trouble + "解决了");
    }

    private void fail(Trouble trouble) {
        System.out.println(trouble + "没解决");
    }

    @Override
    public String toString() {
        return "Support{" +
                "name='" + name + '\'' +
                ", next=" + next +
                '}';
    }
}
