package com.home.prototype;

/**
 * @author GTsung
 * @date 2021/10/27
 */
public class MsgBox implements Product {

    private char decochar;

    public MsgBox(char decochar) {
        this.decochar = decochar;
    }

    @Override
    public void use(String s) {
        int length = s.length();
        for (int i = 0; i < length+4; i++) {
            System.out.println(decochar);
        }
        System.out.println("");
        System.out.println(s);
    }

    @Override
    public Product createClone() {
        Product p = null;
        try {
            p = (Product) clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return p;
    }
}
