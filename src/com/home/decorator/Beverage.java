package com.home.decorator;

/**
 * @author GTsung
 * @date 2021/11/3
 */
public abstract class Beverage {

    String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
