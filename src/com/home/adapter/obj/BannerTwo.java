package com.home.adapter.obj;

/**
 * @author GTsung
 * @date 2021/10/19
 */
public class BannerTwo {

    private String str;

    public BannerTwo(String str) {
        this.str = str;
    }

    public void showWithParen() {
        System.out.println("(" + str + ")");
    }

    public void showWithAster() {
        System.out.println("*" + str + "*");
    }
}
