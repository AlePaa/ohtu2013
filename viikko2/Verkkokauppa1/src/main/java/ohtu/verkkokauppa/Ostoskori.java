package ohtu.verkkokauppa;

import java.util.ArrayList;
import ohtu.verkkokauppa.rajapinnat.Kori;

public class Ostoskori implements Kori {

    ArrayList<Tuote> tuotteet;

    public Ostoskori() {
        tuotteet = new ArrayList<Tuote>();
    }

    @Override
    public void lisaa(Tuote t) {
        tuotteet.add(t);
    }

    @Override
    public void poista(Tuote t) {
        tuotteet.remove(t);
    }

    @Override
    public int hinta() {
        int hinta = 0;

        for (Tuote tuote : tuotteet) {
            hinta += tuote.getHinta();
        }

        return hinta;
    }
}
