package com.home.adapter.clazz;

/**
 * @author GTsung
 * @date 2021/10/19
 */
public class Main {

    public static void main(String[] args) {
        // 继承适配器
        Print print = new PrintBanner("ss");
        print.printStrong();
        print.printWeak();
    }
}
