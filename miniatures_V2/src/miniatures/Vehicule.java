/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package miniatures;

/**
 *
 * @author SIO2
 */
public abstract class Vehicule {
    
    // =====  champs, attributs  =====
    // nom
    protected String nom;
    // année de sortie
    protected int anneeSortie;
    // couleur
    protected String couleur;
    // marque
    protected String marque;
    // miniature rare
    protected boolean rare;
    // miniature endommagée
    protected boolean endommage;

    
    public Vehicule(String pNom, int pAnneeSortie, String pCouleur, String pMarque, boolean pRare, boolean pEndommage) {
        nom = pNom;
        anneeSortie = pAnneeSortie;
        couleur = pCouleur;
        marque = pMarque;
        rare = pRare;
        endommage = pEndommage;
    }

    // =====  accesseurs   =====
    public String getNom() {
        return nom;
    }

    public int getAnneeSortie() {
        return anneeSortie;
    }

    public String getCouleur() {
        return couleur;
    }

    public String getMarque() {
        return marque;
    }

    public boolean isRare() {
        return rare;
    }

    public boolean isEndommage() {
        return endommage;
    }

    // retourner le texte décrivant la voiture
    public abstract String decrire();
    
}
