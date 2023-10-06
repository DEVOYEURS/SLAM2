/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesanimaux3;

import java.time.LocalDate;

/**
 *
 * @author delio
 */
public class Poisson extends Animal {
    private int nbNageoires;

/**
 * 
 * @param pNom
 * @param pRace
 * @param pDateNaissance
 * @param pNbNageoires 
 */
    public Poisson(String pNom, String pRace, LocalDate pDateNaissance, int pNbNageoires) {
        super(pNom, pRace, pDateNaissance);
        nbNageoires = pNbNageoires;
    }

    public String decrire() {
        return String.format("%s poisson de %d ans de race %s a %d nageoires", nom, getAge(), getRace(), nbNageoires);
    }
}
