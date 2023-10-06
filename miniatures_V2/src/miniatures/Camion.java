/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miniatures;

/**
 *
 * @author delio
 */
public class Camion extends Vehicule {

    // =====  méthodes  ===== 

    //constructeur, valorise les attributs privés
    public Camion(String pNom, int pAnneeSortie, String pCouleur, String pMarque, boolean pRare, boolean pEndommage) {
        super(pNom, pAnneeSortie, pCouleur, pMarque, pRare, pEndommage);
    }

    // retourner le texte décrivant la voiture
    public String decrire() {
        return String.format("CAMION : %s sortie en %d, marque %s, couleur %s",
         getNom(), getAnneeSortie(), getMarque(), getCouleur());
    }
}
