package com.home.decorator;

/**
 * @author GTsung
 * @date 2021/11/3
 */
public class Ice extends CondimentDecorator {

    private Beverage beverage;

    public Ice(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return "ice " + beverage.getDescription();
    }

    @Override
    public double cost() {
        return 0.2 + beverage.cost();
    }
}
