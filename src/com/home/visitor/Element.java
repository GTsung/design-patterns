package com.home.visitor;

/**
 * @author GTsung
 * @date 2021/11/4
 */
public interface Element {

    void accept(Visitor visitor);
}
