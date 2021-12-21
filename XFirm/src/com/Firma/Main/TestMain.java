package com.Firma.Main;

import com.Firma.file.TextReader;

import static com.Firma.file.TextReader.fm;

public class TestMain {


    public static void main(String[] args) {

        try {
            new TextReader();
            System.out.println(fm.getAliste());
            fm.deleteAngestellte(fm.getAliste()[1]);
            System.out.println(fm.getAliste());
            System.out.println(fm.getVliste());



        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
