package com.home.prototype;

public interface Product extends Cloneable {

    void use(String s);

    Product createClone();
}
