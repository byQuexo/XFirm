package com.Firma.methods;

import java.time.LocalDate;
import java.time.Period;
import java.util.Arrays;

import static com.Firma.file.TextReader.fm;

public class Software {
    private Mitarbeiter[] aliste = new Mitarbeiter[20];
    private Mitarbeiter[] vliste = new Mitarbeiter[20];
    private String name;

    public Software(String name) {
        this.aliste = aliste;
        this.name = name;
    }

    public Mitarbeiter[] getAliste() {
        return aliste;
    }

    public void setAliste(Angestellte[] aliste) {
        this.aliste = aliste;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean addAngestellte(Mitarbeiter angestellte) {
        boolean added = false;
        for (int i = 0; i < getAliste().length; i++) {
            if (getAliste()[i] == null) {
                getAliste()[i] = angestellte;
                added = true;
                break;
            }
        }
        return added;
    }

    public void setAliste(Mitarbeiter[] aliste) {
        this.aliste = aliste;
    }

    public Mitarbeiter[] getVliste() {
        return vliste;
    }

    public void setVliste(Mitarbeiter[] vliste) {
        this.vliste = vliste;
    }

    public boolean deleteAngestellte(Mitarbeiter mitarbeiter) {
        boolean found = false;
        ;
        for (int i = 0; i < getAliste().length; i++) {
            if (getAliste()[i] != null) {
                if (getAliste()[i].getMitarbeiterId().equalsIgnoreCase(mitarbeiter.getMitarbeiterId())) {
                    getAliste()[i] = null;
                    found = true;
                    break;
                }
            } else {
                continue;
            }
        }
        for (int b = 0; b < getVliste().length; b++) {
            if (getVliste()[b] == null) {
                getVliste()[b] = getAliste()[b];
                break;
            } else {
                continue;
            }
        }
        return found;
    }

    @Override
    public String toString() {
        return "Software{" +
                "aliste=" + Arrays.toString(aliste) +
                ", vliste=" + Arrays.toString(vliste) +
                ", name='" + name + '\'' +
                '}';
    }


    public void durschnittsAlter() {
        int counter = 1;
        int alter = 0;
        for (int i = 0; i < getAliste().length; i++) {
            if (getAliste()[i] != null) {
                alter += Period.between(getAliste()[i].getGebjahr(), LocalDate.now()).getYears();
            } else {
                continue;
            }
            counter++;
        }
        System.out.println("Durschnittsalter = " + alter / counter);
    }


    public void geschlechteraufteilung() {
        int M = 0;
        int W = 0;
        for (int i = 0; i < getAliste().length; i++) {
            if (getAliste()[i] != null) {
                if (getAliste()[i].getGes().equalsIgnoreCase("M")) {
                    M++;
                } else if (getAliste()[i].getGes().equalsIgnoreCase("W")) {
                    W++;
                }
            } else {
                continue;
            }
        }
        System.out.println("Es gibt " + M + " Männer und " + W + " Frauen");
    }


    public void anzahlMitarbeiter() {
        int counter = 0;
        for (int i = 0; i < getAliste().length; i++) {
            if (getAliste()[i] != null) {
                counter++;
            } else {
                continue;
            }
        }
        System.out.println("Es gibt " + counter + " Mitarbeiter");
    }


    public Mitarbeiter laengsteFirmenzugehörigkeit() {
        Mitarbeiter b;
        Mitarbeiter a = getAliste()[0];
        for (int i = 0; i < getAliste().length; i++) {
            if (getAliste()[i] != null) {
                b = getAliste()[i];
                int p1 = Period.between(b.getEintrittsdatum(), LocalDate.now()).getDays() + Period.between(b.getEintrittsdatum(), LocalDate.now()).getMonths() + Period.between(b.getEintrittsdatum(), LocalDate.now()).getYears();
                int p2 = Period.between(a.getEintrittsdatum(), LocalDate.now()).getDays() + Period.between(a.getEintrittsdatum(), LocalDate.now()).getMonths() + Period.between(a.getEintrittsdatum(), LocalDate.now()).getYears();
                if (p1 > p2) {
                    a = getAliste()[i];
                }
            } else {
                continue;
            }
        }
        return a;
    }
}
