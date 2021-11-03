package com.home.decorator;

/**
 * @author GTsung
 * @date 2021/11/3
 */
public class Main {

    public static void main(String[] args) {
        Beverage cola = new Cola();
        System.out.println(cola.getDescription());
        System.out.println(cola.cost());

        CondimentDecorator ice = new Ice(cola);
        System.out.println(ice.getDescription());
        System.out.println(ice.cost());
    }
}
