package com.home.prototype;

import java.util.HashMap;
import java.util.Map;

/**
 * @author GTsung
 * @date 2021/10/27
 */
public class Manager {

    private Map<String, Product> map = new HashMap<>();

    public void register(String name, Product product) {
        map.put(name, product);
    }

    public Product create(String productName) {
        Product p = map.get(productName);
        return p.createClone();
    }
}
