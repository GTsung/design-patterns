package com.home.abstractFactory.factory;

/**
 * @author GTsung
 * @date 2021/10/28
 */
public abstract class Link extends Item {

    protected String url;

    public Link(String caption, String url) {
        super(caption);
        this.url = url;
    }


}
