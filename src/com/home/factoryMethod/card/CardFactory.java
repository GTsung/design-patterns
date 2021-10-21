package com.home.factoryMethod.card;

import com.home.factoryMethod.framework.Factory;
import com.home.factoryMethod.framework.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * @author GTsung
 * @date 2021/10/22
 */
public class CardFactory extends Factory {

    private List<String> owners  = new ArrayList<>();
    @Override
    protected Product createProduct(String owner) {
        return new Card(owner);
    }

    @Override
    protected void registerProduct(Product product) {
        owners.add(((Card)product).getOwner());
    }

    public List<String> getOwners() {
        return owners;
    }
}
