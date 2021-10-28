package com.home.abstractFactory.factory;

import java.util.ArrayList;
import java.util.List;

/**
 * @author GTsung
 * @date 2021/10/28
 */
public abstract class Tray extends Item {

    protected List<Item> tray = new ArrayList<>();

    public Tray(String caption) {
        super(caption);
    }

    public void add(Item item) {
        tray.add(item);
    }

}
