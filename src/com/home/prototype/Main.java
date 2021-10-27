package com.home.prototype;

/**
 * @author GTsung
 * @date 2021/10/27
 */
public class Main {

    public static void main(String[] args) {
        Manager manager = new Manager();

        UnderlinePen underlinePen = new UnderlinePen('!');
        MsgBox msgBox = new MsgBox('@');
        MsgBox msgBox2 = new MsgBox('$');
        manager.register("pen", underlinePen);
        manager.register("b1", msgBox);
        manager.register("b2", msgBox2);


        // 原型模式
        Product p1 = manager.create("pen");
        p1.use("kao");

        Product p2 = manager.create("b1");
        p2.use("ca");

        Product p3 = manager.create("b2");
        p3.use("fuck");
    }
}
