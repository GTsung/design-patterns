package com.home.bridge;

/**
 * 实现层次类的子类
 * @author GTsung
 * @date 2021/10/29
 */
public class StringDisplayImpl extends DisplayImpl {

    private String str;

    private int width;

    public StringDisplayImpl(String str) {
        this.str = str;
        this.width = str.getBytes().length;
    }

    @Override
    public void rawOpen() {
        printLine();
    }

    private void printLine() {
        System.out.print("+");
        for (int i = 0; i < width; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }

    @Override
    public void rawPrint() {
        System.out.println("@" + str + "@");
    }

    @Override
    public void rawClose() {
        printLine();
    }
}
