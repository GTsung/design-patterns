package com.home.adapter.obj;

/**
 * @author GTsung
 * @date 2021/10/19
 */
public class Main {

    /**
     * 委托式的适配器，不能多继承，则需要将类作为属性
     * @param args
     */
    public static void main(String[] args) {
        PrintTwo printBannerTwo = new PrintBannerTwo(new BannerTwo("ss"));
        printBannerTwo.printWeak();
        printBannerTwo.printStrong();
    }
}
