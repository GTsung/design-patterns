package com.home.prototype;

/**
 * @author GTsung
 * @date 2021/10/27
 */
public class UnderlinePen implements Product {

    private char urlChar;

    public UnderlinePen(char urlChar) {
        this.urlChar = urlChar;
    }

    @Override
    public void use(String s) {
        System.out.println(s + " " + urlChar);
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
