package com.learning.designmode.composite;

import org.junit.Test;

public class Tester {

    @Test
    public void test() {
        try {
            Directory rootdir = new Directory("root");
            Directory bindir = new Directory("bin");
            Directory usrdir = new Directory("usr");

            Directory htmldir = new Directory("html");

            File baiduhtml = new File("baidu.html", 1000);
            File youdaohtml = new File("youdao.html", 2000);

            htmldir.add(baiduhtml);
            htmldir.add(youdaohtml);

            rootdir.add(bindir);
            rootdir.add(usrdir);

            usrdir.add(htmldir);

            rootdir.printList();

        } catch (FileTreatmentException e) {
            e.printStackTrace();
        }
    }
}
