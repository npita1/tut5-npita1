package ba.unsa.etf.rpr.tut5;

import java.util.ArrayList;

enum Tip {
    IZBORNI, OBAVEZNI;
}

public class Predmet {
    private String naziv;
    private Integer ectsPoeni;
    private ArrayList<Student> upisani;

    public Predmet(String naziv, Integer ectsPoeni, ArrayList<Student> upisani){};
    public void dodajStudenta(Student s){};

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public Integer getEctsPoeni() {
        return ectsPoeni;
    }

    public void setEctsPoeni(Integer ectsPoeni) {
        this.ectsPoeni = ectsPoeni;
    }

    public ArrayList<Student> getUpisani() {
        return upisani;
    }

    public void setUpisani(ArrayList<Student> upisani) {
        this.upisani = upisani;
    }
}
