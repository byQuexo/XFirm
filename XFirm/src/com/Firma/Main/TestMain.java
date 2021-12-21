package com.Firma.Main;

import com.Firma.file.TextReader;

import static com.Firma.file.TextReader.fm;

public class TestMain {


    public static void main(String[] args) {

        try {
            new TextReader();
            fm.deleteAngestellte(fm.getAliste()[1]);
            System.out.println(fm);
            fm.durschnittsAlter();
            fm.geschlechteraufteilung();
            fm.anzahlMitarbeiter();
            System.out.println(fm.laengsteFirmenzugehörigkeit());

        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
