package com.home.abstractFactory.listfactory;

import com.home.abstractFactory.factory.Item;
import com.home.abstractFactory.factory.Tray;

import java.util.Iterator;

/**
 * @author GTsung
 * @date 2021/10/28
 */
public class ListTray extends Tray {

    public ListTray(String caption) {
        super(caption);
    }

    @Override
    public String makeHtml() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("<li>\n");

        buffer.append(caption + "\n");
        buffer.append("<url>\n");
        Iterator iterator = tray.iterator();
        while (iterator.hasNext()) {
            Item item = (Item) iterator.next();
            buffer.append(item.makeHtml());
        }

        buffer.append("</url>\n");


        buffer.append("</li>\n");
        return buffer.toString();
    }
}
