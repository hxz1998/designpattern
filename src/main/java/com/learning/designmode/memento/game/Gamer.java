package com.learning.designmode.memento.game;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Gamer {

    private int money;
    private List<String> fruits;
    private Random random;
    private static String[] fruitName = {"红豆", "苹果", "西瓜"};

    public Gamer(int money) {
        this.fruits = new LinkedList<>();
        this.random = new Random();
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    public void bet() {
        int dice = random.nextInt(6) + 1;
        if (dice == 1) {
            money += 100;
            System.out.println("赚到了100");
        } else if (dice == 2) {
            money = money/2;
            System.out.println("损失了一半的经济");
        } else if (dice == 6) {
            String fruit = getFruitName();
            System.out.println("获得了水果" + fruit);
            fruits.add(fruit);
        } else {
            System.out.println("什么都没发生");
        }
    }

    public Memento createMemento() {
        Memento memento = new Memento(money);
        for (String fruit: fruits) {
            if (fruit.startsWith("好吃的")) {
                memento.addFruit(fruit);
            }
        }
        return memento;
    }

    public void restoreMemento(Memento memento) {
        this.money = memento.money;
        this.fruits = memento.fruits;
    }

    @Override
    public String toString() {
        return "Gamer{" +
                "money=" + money +
                ", fruits=" + fruits +
                '}';
    }

    private String getFruitName() {
        String prefix = "";
        if (random.nextBoolean()) {
            prefix = "好吃的";
        }
        return prefix + fruitName[random.nextInt(fruitName.length)];
    }
}
