package com.Firma.methods;

import java.time.LocalDate;

public class Manager extends Mitarbeiter{

    private double praemie;
    private double fixGehalt;

    public Manager(String vname, String nname, String adresse, String ges, LocalDate gebjahr, LocalDate eintrittsdatum, double praemie, double fixGehalt) throws Exception {
        super(vname, nname, adresse, ges, gebjahr, eintrittsdatum);
        this.praemie = praemie;
        this.fixGehalt = fixGehalt;
    }

    public double provision(double prozent, Angestellte a) {
        prozent = prozent / 100;
        return (a.getGehalt() * prozent);
    }

    public double gehalt(Angestellte a) {
        return fixGehalt() + provision(5, a);
    }

    public double fixGehalt() {
        return fixGehalt;
    }

    public double getPraemie() {
        return praemie;
    }

    public void setFixGehalt(double fixGehalt) {
        this.fixGehalt = fixGehalt;
    }

    public void gehaltsErhoeung(double d)throws Exception{
        double sum;
        if(d <= 10) {
            d = d / 100;
            sum = fixGehalt() * d;
            setFixGehalt(fixGehalt() + sum);
        } else {
            throw new Exception("% sind zu hoch");
        }
    }

    @Override
    public String toString() {
        return "Manager{" +
                "praemie=" + praemie +
                ", gehalt=" + fixGehalt +
                '}';
    }
}
