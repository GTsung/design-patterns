package com.home.bridge;

/**
 * 功能层次类
 * @author GTsung
 * @date 2021/10/29
 */
public class CountDisplay extends Display {

    public CountDisplay(DisplayImpl displayImpl) {
        super(displayImpl);
    }

    // 自己特有的功能
    public void multiDisplay(int items) {
        open();
        for (int i = 0; i < items; i++) {
            print();
        }
        close();
    }
}
