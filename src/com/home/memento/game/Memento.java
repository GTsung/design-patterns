package com.home.memento.game;

import java.util.ArrayList;
import java.util.List;

/**
 * @author GTsung
 * @date 2021/11/11
 */
public class Memento {
    int money; // 所持金钱
    ArrayList<String> fruits; // 获得的水果

    Memento(int money) {
        this.money = money;
        this.fruits = new ArrayList<>();
    }

    void addFruit(String fruit) {
        fruits.add(fruit);
    }

    List getFruits() {
        // 获取当前所持有的水果
        return (List) fruits.clone();
    }

    public int getMoney() {
        return money;
    }
}
