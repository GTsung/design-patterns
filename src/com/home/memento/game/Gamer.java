package com.home.memento.game;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/**
 * @author GTsung
 * @date 2021/11/11
 */
public class Gamer {

    private int money;
    private List<String> fruits = new ArrayList<>();
    private Random random= new Random();

    private static String[] fruitsName = {
            "苹果","橘子","香蕉","葡萄"
    };

    public Gamer(int money) {
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    public void bet() {
        int dice = random.nextInt(6) + 1;
        if (dice == 1) {
            money+=100;
            System.out.println("金钱增加了");
        } else if (dice == 2) {
            money/=2;
            System.out.println("金钱减半");
        }else if (dice == 6) {
            String f = getFruit();
            System.out.println("获得水果" + f);
            fruits.add(f);
        } else {
            System.out.println("什么都没发生");
        }
    }

    public Memento createMemento() {
        Memento m = new Memento(money);
        Iterator it = fruits.iterator();
        while (it.hasNext()) {
            String f = (String) it.next();
            if (f.startsWith("好吃的")) {
                m.addFruit(f);
            }
        }
        return m;
    }

    public void restoreMemento(Memento memento) {
        this.money = memento.money;
        this.fruits = memento.getFruits();
    }

    @Override
    public String toString() {
        return "[money= " + money+ ", fruits= " + fruits+"]";
    }

    private String getFruit() {
        String prefix = "";
        if (random.nextBoolean()) {
            prefix = "好吃的";
        }
        return prefix+fruitsName[random.nextInt(fruitsName.length)];
    }
}
