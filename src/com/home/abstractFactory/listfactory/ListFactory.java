package com.home.abstractFactory.listfactory;

import com.home.abstractFactory.factory.Factory;
import com.home.abstractFactory.factory.Link;
import com.home.abstractFactory.factory.Page;
import com.home.abstractFactory.factory.Tray;

/**
 * @author GTsung
 * @date 2021/10/28
 */
public class ListFactory extends Factory {

    @Override
    public Link createLink(String caption, String url) {
        return new ListLink(caption, url);
    }

    @Override
    public Tray createTray(String caption) {
        return new ListTray(caption);
    }

    @Override
    public Page createPage(String title, String author) {
        return new ListPage(title, author);
    }
}
