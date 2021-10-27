package com.home.builder.two;

/**
 * @author GTsung
 * @date 2021/10/27
 */
public class Main2 {

    public static void main(String[] args) {
        Something something = Something.builder().age(12).name("ss").sex("1").build();
        System.out.println(something);
    }
}
