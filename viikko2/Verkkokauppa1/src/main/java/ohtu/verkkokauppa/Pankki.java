package ohtu.verkkokauppa;

import ohtu.verkkokauppa.rajapinnat.Kirjanpitaja;

public class Pankki {

    private Kirjanpitaja kirjanpito;

    public Pankki(Kirjanpitaja k) {
        kirjanpito = k;
    }

    public boolean tilisiirto(String nimi, int viitenumero, String tililta, String tilille, int summa) {
        kirjanpito.lisaaTapahtuma("tilisiirto: tililtä " + tilille + " tilille " + tilille
                + " viite " + viitenumero + " summa " + summa + "e");

        // täällä olisi koodi joka ottaa yhteyden pankin verkkorajapintaan
        return true;
    }
}
