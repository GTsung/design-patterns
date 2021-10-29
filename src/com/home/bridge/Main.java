package com.home.bridge;

/**
 * @author GTsung
 * @date 2021/10/29
 */
public class Main {

    /**
     * 桥接模式意在将功能层次与实现层次分离开来，将实现层次顶类组合到功能层次顶类中
     * @param args
     */
    public static void main(String[] args) {
        Display d1 = new Display(new StringDisplayImpl("hello China"));
        Display d2 = new CountDisplay(new StringDisplayImpl("fuck Liu Xiao's mother"));
        CountDisplay d3 = new CountDisplay(new StringDisplayImpl("FUCK"));
        d1.display();
        d2.display();
        d3.display();
        d3.multiDisplay(5);
    }
}
