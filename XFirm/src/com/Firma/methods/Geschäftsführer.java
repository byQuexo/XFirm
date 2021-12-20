package com.Firma.methods;

import java.time.LocalDate;

public class Geschäftsführer extends Mitarbeiter{

    private double Lohn;

    public Geschäftsführer(String vname, String nname, String adresse, String ges, LocalDate gebjahr, LocalDate eintrittsdatum) throws Exception {
        super(vname, nname, adresse, ges, gebjahr, eintrittsdatum);
        String mid = getMitarbeiterId() + 'G';
        setMitarbeiterId(mid);
    }
}
