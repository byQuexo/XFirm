package com.Firma.Main;

import com.Firma.file.TextReader;

public class TestMain {


    public static void main(String[] args) {

        try {
            new TextReader();
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
