package ba.unsa.etf.rpr.tut5;

import java.util.ArrayList;
import java.util.Map;

public class PlanStudija {
    private Map<Integer, ArrayList<Predmet>> izborni;
    private Map<Integer,ArrayList<Predmet>> obavezni;

    public PlanStudija(Map<Integer,ArrayList<Predmet>> izborni,  Map<Integer,ArrayList<Predmet>> obavezni) {
        this.izborni = izborni; this.obavezni = obavezni;
    }

    public void dodajPredmet(Predmet p){};

    public Map<Integer, ArrayList<Predmet>> getIzborni() {
        return izborni;
    }

    public void setIzborni(Map<Integer, ArrayList<Predmet>> izborni) {
        this.izborni = izborni;
    }


    public Map<Integer, ArrayList<Predmet>> getObavezni() {
        return obavezni;
    }

    public void setObavezni(Map<Integer, ArrayList<Predmet>> obavezni) {
        this.obavezni = obavezni;
    }
}
