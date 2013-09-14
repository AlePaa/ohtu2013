/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ohtu.verkkokauppa.rajapinnat;

import java.util.ArrayList;

/**
 *
 * @author alpa
 */
public interface Kirjanpitaja {

    ArrayList<String> getTapahtumat();

    void lisaaTapahtuma(String tapahtuma);
    
}
