package com.home.visitor;

import java.util.Iterator;

/**
 * @author GTsung
 * @date 2021/11/4
 */
public class ListVisitor extends Visitor {

    private String currentDir = "";

    @Override
    public void visit(File file) {
        System.out.println(currentDir + "/" + file);
    }

    @Override
    public void visit(Directory directory) {
        System.out.println(currentDir + "/" + directory);
        String saveDir = currentDir;
        currentDir = currentDir + "/" + directory.getName();
        Iterator it = directory.iterator();
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            entry.accept(this);
        }
        currentDir = saveDir;
    }
}
