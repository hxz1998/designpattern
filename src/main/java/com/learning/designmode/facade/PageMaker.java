package com.learning.designmode.facade;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PageMaker {

    private PageMaker() {}

    public static void makeWelcomePage(String mailaddr, String filename) {
        try {
            Properties mailprop = Database.getProperty("maildata");
            String username = mailprop.getProperty(mailaddr);
            File file = new File("src/main/resources/" + filename);
            if (file.exists()) {
                file.delete();
                System.out.println("删除掉了已存在的文件。");
            }
            HTMLWriter writer = new HTMLWriter(new FileWriter("src/main/resources/" + filename));
            writer.title(username);
            writer.paragraph("欢迎来到" + username + "的主页");
            writer.mailto(mailaddr, username);
            writer.close();
            System.out.println("完成制作");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
