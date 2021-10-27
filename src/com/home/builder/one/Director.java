package com.home.builder.one;

/**
 * @author GTsung
 * @date 2021/10/27
 */
public class Director {

    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void constructor() {
        builder.makeTitle("Morning");
        builder.makeString("good");
        builder.makeItems(new String[]{"fuck", "love"});
        builder.close();
    }
}
