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
public class Voiture extends Vehicule {
    // nombre de portes
    private int nbPortes;
    
    public int getNbPortes() {
            return nbPortes;
    }
    

    // =====  méthodes  ===== 

    //constructeur, valorise les attributs privés
    public Voiture(String pNom, int pAnneeSortie, String pCouleur, String pMarque, int pNbPortes, boolean pRare, boolean pEndommage) {
        super(pNom, pAnneeSortie, pCouleur, pMarque, pRare, pEndommage);
        endommage = pEndommage;
    }

    // retourner le texte décrivant la voiture
    public String decrire() {
        return String.format(
        "VOITURE : %s sortie en %d, marque %s, couleur %s, nombre de portes %d",
            nom, anneeSortie, marque, couleur, nbPortes);
    }
}
