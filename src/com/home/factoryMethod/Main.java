package com.home.factoryMethod;

import com.home.factoryMethod.card.Card;
import com.home.factoryMethod.card.CardFactory;
import com.home.factoryMethod.framework.Factory;
import com.home.factoryMethod.framework.Product;

/**
 * @author GTsung
 * @date 2021/10/22
 */
public class Main {

    public static void main(String[] args) {
        Factory factory = new CardFactory();
        Product p1= factory.create("a");
        Product p2= factory.create("b");
        Product p3= factory.create("c");
        p1.use();
        p2.use();
        p3.use();
    }
}
