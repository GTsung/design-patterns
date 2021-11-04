package com.home.visitor;

import java.util.Iterator;

/**
 * @author GTsung
 * @date 2021/11/4
 */
public abstract class Entry implements Element {

    public abstract String getName();

    public abstract int getSize();

    public Entry add(Entry entry) throws RuntimeException {
        throw new RuntimeException();
    }

    public String toString() {
        return getName() + "(" + getSize() + ")";
    }

}
