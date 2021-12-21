package com.Firma.file;

import com.Firma.methods.Mitarbeiter;

import java.io.FileNotFoundException;
import java.io.FileWriter;

import static com.Firma.file.TextReader.fm;

public class TextWriter {

    public TextWriter() throws FileNotFoundException {
        try {
            Mitarbeiter a;
            FileWriter fl = new FileWriter("D:\\IntelliJ-Projects\\XFirm\\src\\personen.txt");
            for (int i = 0; i < fm.getAliste().length; i++) {
                a = fm.getAliste()[i];
                fl.write(a.getVname() + ", " + a.getVname() + ", " + a.getAdresse() + ", " + a.getGes() + ", " + a.getGebjahr() + "," + a.getEintrittsdatum() + "\n" + "HUND");
            }
            fl.close();
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }







}
