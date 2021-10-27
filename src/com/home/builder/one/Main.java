package com.home.builder.one;

/**
 * @author GTsung
 * @date 2021/10/27
 */
public class Main {

    public static void main(String[] args) {
        TextBuilder textBuilder = new TextBuilder();
        Director director = new Director(textBuilder);
        director.constructor();
        System.out.println(textBuilder.getResult());
    }
}
