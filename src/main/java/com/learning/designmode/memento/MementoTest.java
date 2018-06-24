package com.learning.designmode.memento;

import com.learning.designmode.memento.game.Gamer;
import com.learning.designmode.memento.game.Memento;
import org.junit.Test;

public class MementoTest {
    @Test
    public void test() {
        Gamer gamer = new Gamer(100);
        Memento memento = gamer.createMemento();

        for (int i = 0; i < 100; i++) {
            System.out.println("======  " + i);
            System.out.println("当前状态：" + gamer);
            gamer.bet();
            System.out.println("所持金钱为：" + gamer.getMoney());
            if (gamer.getMoney() > memento.getMoney()) {
                System.out.println("金钱增加了很多，保存下最好状态");
                memento = gamer.createMemento();
            } else if (gamer.getMoney() < memento.getMoney()) {
                System.out.println("金钱损失了很多，需要恢复一下");
                gamer.restoreMemento(memento);
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
