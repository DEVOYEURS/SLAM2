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
public class VehiculeSpecial extends Vehicule {
    // =====  champs, attributs  =====

    // spécialité
    private String specialite;
    
    // =====  accesseurs   ===== 
    
    public String getSpecialite() {
        return specialite;
    }
    

    // =====  méthodes  ===== 

    //constructeur, valorise les attributs privés
    public VehiculeSpecial(String pNom, int pAnneeSortie, String pCouleur, String pMarque,String pSpecialite, boolean pRare, boolean pEndommage) {
        super(pNom, pAnneeSortie, pCouleur, pMarque, pRare, pEndommage);
        endommage = pEndommage;

    }

    // retourner le texte décrivant la voiture
    public String decrire() {
        return String.format("VEHICULE SPECIAL : %s sortie en %d, marque %s, couleur %s, spécialité %s",
         getNom(), getAnneeSortie(), getMarque(), getCouleur(), getSpecialite());
    }
}
