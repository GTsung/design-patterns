package com.home.abstractFactory.factory;

/**
 * @author GTsung
 * @date 2021/10/28
 */
public abstract class Factory {
    public static Factory getFactory(Class clazz) {
        Factory factory = null;
        try {
            factory = (Factory) clazz.newInstance();
        } catch (Exception e) {
        }
        return factory;
    }

    public abstract Link createLink(String caption, String url);

    public abstract Tray createTray(String caption);

    public abstract Page createPage(String title, String author);
}
