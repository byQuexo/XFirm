package com.Firma.file;

import com.Firma.methods.*;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class TextReader {
    public static Firma fm = new Firma("XFirm");
    public TextReader() throws FileNotFoundException {
        BufferedReader br;
        try {
            br = new BufferedReader(new FileReader("D:\\IntelliJ-Projects\\XFirm\\src\\personen.txt"));
            String line;
            int zeile = 0;
            while ((line = br.readLine()) != null) {
                String[] strings = line.split(", ");
                DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
                LocalDate geb = LocalDate.parse(strings[4], timeFormatter);
                LocalDate eintritt = LocalDate.parse(strings[5], timeFormatter);
                zeile++;

            }
            System.out.println(fm);
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
