package com.Firma.methods;

import java.time.LocalDate;

public class Angestellte extends Mitarbeiter {
    private double gehalt;

    public Angestellte(String vname, String nname, String adresse, String ges, LocalDate gebjahr, LocalDate eintrittsdatum) throws Exception {
        super(vname, nname, adresse, ges, gebjahr, eintrittsdatum);
        String mitarbeiterId = getMitarbeiterId() + "A";
        setMitarbeiterId(mitarbeiterId);
    }

    public void gehaltsErhoeung() {
        double sum = getGehalt()*0.05;
        setGehalt(getGehalt()*sum);
    }


    public double getGehalt() {
        return gehalt;
    }

    public void setGehalt(double lohn) {
        gehalt = lohn;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Lohn='" + gehalt + '\'' +
                '}';
    }
}
