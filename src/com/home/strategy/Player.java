package com.home.strategy;

/**
 * @author GTsung
 * @date 2021/11/1
 */
public class Player {

    private Strategy strategy;

    private String name;

    private int winCount;
    private int loseCount;
    private int gameCount;

    public Player(Strategy strategy, String name) {
        this.strategy = strategy;
        this.name = name;
    }

    public Hand nextHand() {
        return strategy.nextHand();
    }

    public void win() {
        strategy.study(true);
        winCount++;
        gameCount++;
    }

    public void lose() {
        strategy.study(false);
        loseCount++;
        gameCount++;
    }

    public void even() {
        gameCount++;
    }

    @Override
    public String toString() {
        return "Player{" +
                "strategy=" + strategy +
                ", name='" + name + '\'' +
                ", winCount=" + winCount +
                ", loseCount=" + loseCount +
                ", gameCount=" + gameCount +
                '}';
    }
}
