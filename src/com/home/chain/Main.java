package com.home.chain;

/**
 * 职责链模式
 * @author GTsung
 * @date 2021/11/5
 */
public class Main {

    public static void main(String[] args) {
        Support alice = new NoSupport("Alice");
        Support bob = new LimitSupport("Bob", 100);
        Support jane = new SpecialSupport("jane", 429);
        Support diana = new LimitSupport("diana", 20);
        Support adams = new OddSupport("adams");
        alice.setNext(bob).setNext(jane).setNext(diana).setNext(adams);
        for (int i = 0; i < 500; i++) {
            alice.support(new Trouble(i));
        }
    }
}
