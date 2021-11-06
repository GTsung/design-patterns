package com.home.facade;

import java.io.IOException;

/**
 * @author GTsung
 * @date 2021/11/6
 */
public class Main {

    public static void main(String[] args) throws IOException {
        // 只需要调用外观模式即可
        PageMaker.makeWelcomePage("tomura@toma.com", "welcome.html");
    }
}
