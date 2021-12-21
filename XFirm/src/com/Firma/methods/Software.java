package com.Firma.methods;

import java.util.Arrays;

import static com.Firma.file.TextReader.fm;

public class Software {
    private Mitarbeiter[] aliste = new Mitarbeiter[20];
    private Mitarbeiter[] vliste;
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
        for(int i = 0; i < getAliste().length; i++) {
            if(getAliste()[i] == null) {
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
        for (int i = 0; i < getAliste().length; i++) {
            if (getAliste()[i].getMitarbeiterId().equalsIgnoreCase(mitarbeiter.getMitarbeiterId())) {
                getAliste()[i] = null;
                Arrays.sort(getAliste());
                for (int b = 0; b < getVliste().length; b++) {
                    if (getVliste()[i] == null) {
                        getVliste()[i] = getAliste()[i];
                        break;
                    }
                    found = true;
                }
            }
        }
        return found;
    }

    @Override
    public String toString() {
        return "Firma{" +
                "aliste=" + Arrays.toString(aliste) +
                ", name='" + name + '\'' +
                '}';
    }

    public void setGehalt() {

        for (int i = 0; i < fm.getAliste().length; i++ ) {
            if(fm.getAliste()[i] instanceof Manager) {

            }
        }
    }
}
