package com.home.single;

/**
 * 单例模式
 * @author GTsung
 * @date 2021/10/27
 */
public class Singleton {

    private Singleton() {}

    private static class SingletonHolder {
        private static Singleton singleton = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonHolder.singleton;
    }
}
