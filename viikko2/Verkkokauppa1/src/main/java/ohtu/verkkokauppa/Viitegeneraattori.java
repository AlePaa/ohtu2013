package ohtu.verkkokauppa;

import ohtu.verkkokauppa.rajapinnat.ViiteGen;

public class Viitegeneraattori implements ViiteGen {

    private static Viitegeneraattori instanssi;

    public static Viitegeneraattori getInstance() {
        if (instanssi == null) {
            instanssi = new Viitegeneraattori();
        }

        return instanssi;
    }
    
    private int seuraava;
    
    private Viitegeneraattori(){
        seuraava = 1;    
    }
    
    @Override
    public int uusi(){
        return seuraava++;
    }
}
