package com.home.abstractFactory.listfactory;

import com.home.abstractFactory.factory.Link;

/**
 * @author GTsung
 * @date 2021/10/28
 */
public class ListLink extends Link {

    public ListLink(String caption, String url) {
        super(caption, url);
    }

    @Override
    public String makeHtml() {
        return "<li><a href=\"" + url + "\"/>" + caption + "</a></li>";
    }
}
