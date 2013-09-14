package ohtu.verkkokauppa;

import ohtu.verkkokauppa.rajapinnat.ViiteGen;
import org.springframework.stereotype.Component;

@Component
public class Viitegeneraattori implements ViiteGen {

    private int seuraava;

    public Viitegeneraattori() {
        seuraava = 1;
    }

    @Override
    public int uusi() {
        return seuraava++;
    }
}
