package com.learning.designmode.facade;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Database {

    private Database() {}

    public static Properties getProperty(String key) {
        String filename = key + ".properties";
        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream("src/main/resources/" + filename));
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("警告：" + filename + "未找到");
        }
        return properties;
    }
}
