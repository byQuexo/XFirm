package com.Firma.methods;

import java.time.LocalDate;

public class Mitarbeiter {

    private String vname;
    private String nname;
    private String adresse;
    private LocalDate gebjahr;
    private String ges;
    private LocalDate eintrittsdatum;
    private static int count = 1;
    private String MitarbeiterId;

    public Mitarbeiter(String vname, String nname, String adresse, String ges, LocalDate gebjahr, LocalDate eintrittsdatum)throws Exception {
        this.vname = vname;
        this.nname = nname;
        this.adresse = adresse;
        this.gebjahr = gebjahr;
        this.ges = ges;
        this.eintrittsdatum = eintrittsdatum;
        String mitarbeiterId = getGes() + getGebjahr().getYear() + getVname().charAt(0) + getNname().charAt(0) + count;
        setMitarbeiterId(mitarbeiterId);
        count++;
    }

    public void MitarbeiterAkte() {

    }




    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Mitarbeiter.count = count;
    }

    public String getMitarbeiterId() {
        return MitarbeiterId;
    }

    public void setMitarbeiterId(String mitarbeiterId) {
        MitarbeiterId = mitarbeiterId;
    }

    public String getVname() {
        return vname;
    }

    public void setVname(String vname) {
        this.vname = vname;
    }

    public String getNname() {
        return nname;
    }

    public void setNname(String nname) {
        this.nname = nname;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public LocalDate getGebjahr() {
        return gebjahr;
    }

    public void setGebjahr(LocalDate gebjahr) throws Exception{
        if (gebjahr.isBefore(eintrittsdatum)) {
            throw new Exception("Flaschen geb Datum");
        }
        this.gebjahr = gebjahr;
    }

    public LocalDate getEintrittsdatum() {
        return eintrittsdatum;
    }

    public void setEintrittsdatum(LocalDate eintrittsdatum) throws Exception{
        if(eintrittsdatum.isBefore(gebjahr)) {
            throw new Exception("Falsches Entrittsdatum");
        }
        this.eintrittsdatum = eintrittsdatum;
    }

    public String getGes() {
        return ges;
    }

    public void setGes(String ges) {
        this.ges = ges;
    }

    @Override
    public String toString() {
        return "vname='" + vname + '\'' +
                ", nname='" + nname + '\'' +
                ", adresse='" + adresse + '\'' +
                ", gebjahr=" + gebjahr +
                ", ges='" + ges + '\'' +
                ", eintrittsdatum=" + eintrittsdatum +
                ", MitarbeiterId='" + MitarbeiterId + '\'';
    }
}
