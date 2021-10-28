package com.home.abstractFactory.factory;

/**
 * @author GTsung
 * @date 2021/10/28
 */
public abstract class Item {

    protected String caption;

    public Item(String caption) {
        this.caption = caption;
    }

    public abstract String makeHtml();
}
