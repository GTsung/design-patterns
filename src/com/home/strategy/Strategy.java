package com.home.strategy;

public interface Strategy {

    Hand nextHand();

    void study(boolean win);
}
