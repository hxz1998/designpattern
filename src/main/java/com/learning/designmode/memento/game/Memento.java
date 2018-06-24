package com.learning.designmode.memento.game;

import java.util.ArrayList;
import java.util.List;

public class Memento {
    int money;
    List<String> fruits;

    public int getMoney() {
        return money;
    }

    Memento(int money) {
        this.fruits = new ArrayList<>();
        this.money = money;
    }

    void addFruit(String fruit) {
        this.fruits.add(fruit);
    }

    List<String> getFruits() {
        return fruits;
    }

}
