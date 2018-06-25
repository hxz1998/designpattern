package com.learning.designmode.flyweight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BigChar {

    private char charname;
    private String fontdata;

    public BigChar(char charname) {
        this.charname = charname;
        try {
            BufferedReader reader = new BufferedReader(
                    new FileReader("src/main/resources/fonts/big" + charname + ".txt"));
            fontdata = reader.readLine();
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void print() {
        System.out.println(fontdata);
    }

}
