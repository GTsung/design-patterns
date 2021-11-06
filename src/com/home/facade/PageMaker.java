package com.home.facade;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/**
 * 外观模式类
 * @author GTsung
 * @date 2021/11/6
 */
public class PageMaker {

    private PageMaker() {

    }

    public static void makeWelcomePage(String mailAddr, String filename) throws IOException {
        Properties properties = Database.getProperties("adams");
        String username = properties.getProperty(mailAddr);
        HtmlWriter writer = new HtmlWriter(new FileWriter(filename));
        writer.title("welcome to " + username + "'s page!");
        writer.paragraph("等着你的邮件");
        writer.mailto(mailAddr, username);
        writer.close();
        System.out.println(filename + " is created for " + mailAddr
                + " (" + username + ")");
    }
}
