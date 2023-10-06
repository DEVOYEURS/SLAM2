/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package siomd;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author SIO2
 */
public class Cooperateur {
    private int numCooperateur;
    private String nomCooperateur;
    private Map<Integer, Parcelle> mesParcelles;

    /**
     * @return the numCooperateur
     */
    public int getNumCooperateur() {
        return numCooperateur;
    }

    /**
     * @return the nomCooperateur
     */
    public String getNomCooperateur() {
        return nomCooperateur;
    }
    
    // retourne un itérateur pour les parcelles 
    public Iterator getIterParcelles() {
        return mesParcelles.values().iterator();
    }

    public Cooperateur(int pNumCooperateur, String pNomCooperateur) {
        numCooperateur = pNumCooperateur;
        nomCooperateur = pNomCooperateur;
        mesParcelles = new HashMap<>();
    }
    
    public void ajouterParcelle(Parcelle uneParcelle) {
        mesParcelles.put(uneParcelle.getNumParcelle(), uneParcelle);
    }

    // retourne le rendement de toutes les parcelles du viticulteur,
    // c'est-à-dire la somme que la coopérative 
    //     devra verser au coopérateur (viticulteur)
    //   il faut parcourir les parcelles et cumuler le rendement de chaque parcelle
    public double rendement() {
        double somme = 0;
        for (Parcelle uneParcelle : mesParcelles.values()) {
            somme += uneParcelle.rendement();
        }
        return somme;
    }
}
