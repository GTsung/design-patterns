package com.home.visitor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author GTsung
 * @date 2021/11/4
 */
public class Directory extends Entry {

    private String name;

    private List<Entry> list = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        int size = 0;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            size += entry.getSize();
        }
        return size;
    }

    @Override
    public Entry add(Entry entry) throws RuntimeException {
        list.add(entry);
        return this;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public Iterator iterator() {
        return list.iterator();
    }
}
