package com.home.template;

/**
 * @author GTsung
 * @date 2021/10/20
 */
public class StringDisplay extends AbstractDisplay {

    private String str;

    private int width;

    public StringDisplay(String str) {
        this.str = str;
        this.width = str.getBytes().length;
    }


    @Override
    public void open() {
        printLine();
    }

    private void printLine() {
        System.out.println("+");
        for (int i = 0; i < width; i++) {
            System.out.println("-");
        }
        System.out.println("+");
    }

    @Override
    public void print() {
        System.out.println("|" + str + "|");
    }

    @Override
    public void close() {
        printLine();
    }
}
