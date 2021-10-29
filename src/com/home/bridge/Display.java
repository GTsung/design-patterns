package com.home.bridge;

/**
 * 功能层次类顶类
 * @author GTsung
 * @date 2021/10/29
 */
public class Display {

    private DisplayImpl displayImpl;

    public Display(DisplayImpl displayImpl) {
        this.displayImpl = displayImpl;
    }

    public void open() {
        displayImpl.rawOpen();
    }

    public void print() {
        displayImpl.rawPrint();
    }

    public void close() {
        displayImpl.rawClose();
    }

    public final void display() {
        open();
        print();
        close();
    }
}
