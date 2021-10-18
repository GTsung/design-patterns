package com.home.iterator;

/**
 * 存放元素的集合
 */
public interface Aggregate {

    /**
     * 获取迭代器
     * @return
     */
    MyIterator iterator();
}
