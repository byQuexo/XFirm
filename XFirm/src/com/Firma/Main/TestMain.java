package com.Firma.Main;

import com.Firma.file.TextReader;
import com.Firma.file.TextWriter;
import com.Firma.methods.Firma;

import static com.Firma.file.TextReader.fm;

public class TestMain {


    public static void main(String[] args) {

        try {
            new TextReader();
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
