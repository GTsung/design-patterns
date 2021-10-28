package com.home.abstractFactory.factory;

import java.io.FileWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

/**
 * @author GTsung
 * @date 2021/10/28
 */
public abstract class Page {
    protected String title;
    protected String author;
    protected List<Item> content = new ArrayList<>();

    public Page(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void add(Item item) {
        content.add(item);
    }

    public void output() {
        try {
            String filename = title + ".html";
            Writer writer = new FileWriter(filename);
            writer.write(this.makeHtml());
            writer.close();
            System.out.println(filename + "编写完成");
        } catch (Exception e) {
        }
    }

    protected abstract String makeHtml();
}
