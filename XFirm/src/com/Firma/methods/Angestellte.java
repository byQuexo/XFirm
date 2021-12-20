package com.Firma.methods;

import java.time.LocalDate;

public class Angestellte extends Mitarbeiter {
    private String Lohn;

    public Angestellte(String vname, String nname, String adresse, String ges, LocalDate gebjahr, LocalDate eintrittsdatum) throws Exception {
        super(vname, nname, adresse, ges, gebjahr, eintrittsdatum);
        String mitarbeiterId = getMitarbeiterId() + "A";
        setMitarbeiterId(mitarbeiterId);
    }

    public String getLohn() {
        return Lohn;
    }

    public void setLohn(String lohn) {
        Lohn = lohn;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Lohn='" + Lohn + '\'' +
                '}';
    }
}
