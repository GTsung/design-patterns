package com.home.template;

/**
 * @author GTsung
 * @date 2021/10/20
 */
public abstract class AbstractDisplay {

    public abstract void open();

    public abstract void print();

    public abstract void close();

    public void display() {
        open();
        for (int i = 0; i < 5; i++) {
            print();
        }
        close();
    }

}
