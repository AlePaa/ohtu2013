package ohtu.verkkokauppa;

import ohtu.verkkokauppa.rajapinnat.*;

public class Kauppa {

    private Makasiini varasto;
    private Pankki pankki;
    private Kori ostoskori;
    private ViiteGen viitegeneraattori;
    private String kaupanTili;

    public Kauppa(Makasiini m, Pankki p, ViiteGen g) {
        varasto = m;
        pankki = p;
        viitegeneraattori = g;
        kaupanTili = "33333-44455";
    }

    public void aloitaAsiointi() {
        ostoskori = new Ostoskori();
    }

    public void poistaKorista(int id) {
        Tuote t = varasto.haeTuote(id);
        varasto.palautaVarastoon(t);
    }

    public void lisaaKoriin(int id) {
        if (varasto.saldo(id) > 0) {
            Tuote t = varasto.haeTuote(id);
            ostoskori.lisaa(t);
            varasto.otaVarastosta(t);
        }
    }

    public boolean tilimaksu(String nimi, String tiliNumero) {
        int viite = viitegeneraattori.uusi();
        int summa = ostoskori.hinta();

        return pankki.tilisiirto(nimi, viite, tiliNumero, kaupanTili, summa);
    }
}
