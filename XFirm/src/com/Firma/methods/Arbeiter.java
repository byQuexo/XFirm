package com.Firma.methods;

import java.time.LocalDate;

public class Arbeiter extends Mitarbeiter {

    private double stundenlohn;
    private double anzStunden;
    private double ueberstundenzuschlag;
    private int anzUeberstunden;
    private double schichtzulage;
    private double praemie;


    public Arbeiter(String vname, String nname, String adresse, String ges, LocalDate gebjahr, LocalDate eintrittsdatum, double stundenlohn, double anzStunden, double ueberstundenzuschlag, int anzUeberstunden, double schichtzulage, double praemie) throws Exception{
        super(vname, nname, adresse, ges, gebjahr, eintrittsdatum);
        this.stundenlohn = stundenlohn;
        this.anzStunden = anzStunden;
        this.ueberstundenzuschlag = ueberstundenzuschlag;
        this.anzUeberstunden = anzUeberstunden;
        this.schichtzulage = schichtzulage;
        this.praemie = praemie;
        String mitarbeiterId = getMitarbeiterId() + "AR";
        setMitarbeiterId(mitarbeiterId);
    }

    public void setStundenlohn(double stundenlohn) {
        this.stundenlohn = stundenlohn;
    }

    public double getStundenlohn() {
        return stundenlohn;
    }

    public double getAnzStunden() {
        return anzStunden;
    }

    public double getUeberstundenzuschlag() {
        return ueberstundenzuschlag;
    }

    public int getAnzUeberstunden() {
        return anzUeberstunden;
    }

    public double getSchichtzulage() {
        return schichtzulage;
    }

    public double getPraemie() {
        return praemie;
    }

    public double gehalt() {
        return getAnzStunden() * getStundenlohn() + getAnzUeberstunden() * getUeberstundenzuschlag() + getSchichtzulage();
    }

    public void gehaltsErhoeung(double d) {
        double sum;
        d = d / 100;
        sum = getStundenlohn() * d;
        setStundenlohn(getStundenlohn()+sum);
    }

    @Override
    public String toString() {
        return "Arbeiter{" +
                "stundenlohn=" + stundenlohn +
                ", anzStunden=" + anzStunden +
                ", ueberstundenzuschlag=" + ueberstundenzuschlag +
                ", anzUeberstunden=" + anzUeberstunden +
                ", schichtzulage=" + schichtzulage +
                ", praemie=" + praemie +
                '}';
    }
}
