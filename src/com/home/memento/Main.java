package com.home.memento;

import com.home.memento.game.Gamer;
import com.home.memento.game.Memento;

/**
 * 备忘录模式
 * @author GTsung
 * @date 2021/11/11
 */
public class Main {

    public static void main(String[] args) {
        Gamer gamer = new Gamer(100);
        Memento memento = gamer.createMemento();
        for (int i = 0; i < 100; i++) {
            System.out.println("====" + i);
            System.out.println("当前状态：" + gamer);
            gamer.bet();

            System.out.println("所持金钱" + gamer.getMoney());
            // 决定如何处理memento
            if (gamer.getMoney() > memento.getMoney()) {
                System.out.println("金钱增加，保持现有状态");
                memento = gamer.createMemento();
            } else if (gamer.getMoney() < memento.getMoney() /2) {
                System.out.println("金钱减少了很多，恢复之前状态");
                gamer.restoreMemento(memento);
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {

            }
            System.out.println();
        }
    }
}
