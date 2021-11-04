package com.home.visitor;



/**
 * @author GTsung
 * @date 2021/11/4
 */
public abstract class Visitor {

    public abstract void visit(File file);

    public abstract void visit(Directory directory);

}
