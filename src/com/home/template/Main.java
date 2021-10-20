package com.home.template;

/**
 * @author GTsung
 * @date 2021/10/20
 */
public class Main {

    public static void main(String[] args) {
        AbstractDisplay strDisplay = new StringDisplay("ss");
        strDisplay.display();
        System.err.println("====================");
        AbstractDisplay charDisplay = new CharDisplay('a');
        charDisplay.display();
    }
}
