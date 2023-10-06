/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package siomd;

/**
 *
 * @author SIO2
 */
public class Parcelle {
    private int numParcelle;
    private Commune maCommune;
    private int nbHectares;
    private int qteProduction; // en kg

    /**
     * @return the numParcelle
     */
    public int getNumParcelle() {
        return numParcelle;
    }

    /**
     * @return the nbHectares
     */
    public int getNbHectares() {
        return nbHectares;
    }

    /**
     * @return the qteProduction
     */
    public int getQteProduction() {
        return qteProduction;
    }
    
    public Parcelle(int pNumParcelle, int pNbHectares, int pQteProduction, Commune pCommune) {
        numParcelle = pNumParcelle;
        nbHectares = pNbHectares;
        qteProduction = pQteProduction;
        maCommune = pCommune;
    }
    
    // retourne le rendement  de la parcelle
    public double rendement() {
        return qteProduction * Coop.Prix_100;
    }

    // retourne la description de la parcelle
    public String decrire() {
        return String.format("\n%d\t\t %s\t\t %d\t\t %d\t\t %.2f", getNumParcelle(), maCommune.getNomCommune(), getNbHectares(), getQteProduction(), rendement());
    }

}
