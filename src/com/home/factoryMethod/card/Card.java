package com.home.factoryMethod.card;

import com.home.factoryMethod.framework.Product;

/**
 * @author GTsung
 * @date 2021/10/22
 */
public class Card extends Product {

    private String owner;

    public Card(String owner) {
        System.out.println("制作" + owner + "的卡");
        this.owner = owner;
    }

    public String getOwner() {
        return owner;
    }

    @Override
    public void use() {
        System.out.println("使用" + owner + "的卡");
    }


}
