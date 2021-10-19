package com.home.adapter.obj;

/**
 * @author GTsung
 * @date 2021/10/19
 */
public class PrintBannerTwo extends PrintTwo {

    private BannerTwo bannerTwo;

    public PrintBannerTwo(BannerTwo bannerTwo) {
        this.bannerTwo = bannerTwo;
    }

    @Override
    public void printWeak() {
        bannerTwo.showWithParen();
    }

    @Override
    public void printStrong() {
        bannerTwo.showWithAster();
    }
}
