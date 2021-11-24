package ba.unsa.etf.rpr.tut5;

import java.util.ArrayList;

public class Student {
    private String ime_prezime;
    private Integer brojIndexa;
    private Integer semestar;
    private ArrayList<Predmet> predmeti;

    public Student (String ime, Integer index, Integer semestar) {
        ime_prezime = ime;
        brojIndexa = index;
        this.semestar = semestar;
        predmeti = new ArrayList();
    }

    public void dodajPredmet(Predmet p) {};

    @Override
    public String toString(){return "";}


    public String getIme_prezime() {
        return ime_prezime;
    }

    public void setIme_prezime(String ime_prezime) {
        this.ime_prezime = ime_prezime;
    }

    public Integer getBrojIndexa() {
        return brojIndexa;
    }

    public void setBrojIndexa(Integer brojIndexa) {
        this.brojIndexa = brojIndexa;
    }

    public Integer getSemestar() {
        return semestar;
    }

    public void setSemestar(Integer semestar) {
        this.semestar = semestar;
    }

    public ArrayList<Predmet> getPredmeti() {
        return predmeti;
    }

    public void setPredmeti(ArrayList<Predmet> predmeti) {
        this.predmeti = predmeti;
    }
}
