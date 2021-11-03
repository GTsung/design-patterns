package com.home.decorator;

/**
 * 可乐
 * @author GTsung
 * @date 2021/11/3
 */
public class Cola extends Beverage {

    @Override
    public String getDescription() {
        return "cola";
    }

    @Override
    public double cost() {
        return 3;
    }
}
