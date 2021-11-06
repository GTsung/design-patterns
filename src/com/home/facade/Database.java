package com.home.facade;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * @author GTsung
 * @date 2021/11/6
 */
public class Database {

    private Database() {}

    public static Properties getProperties(String dbname) {
        String filename = dbname + ".txt";
        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream(filename));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties;
    }
}
