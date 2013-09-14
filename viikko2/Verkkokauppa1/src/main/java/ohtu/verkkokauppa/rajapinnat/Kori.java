/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ohtu.verkkokauppa.rajapinnat;

import ohtu.verkkokauppa.Tuote;

/**
 *
 * @author alpa
 */
public interface Kori {

    int hinta();

    void lisaa(Tuote t);

    void poista(Tuote t);
    
}
