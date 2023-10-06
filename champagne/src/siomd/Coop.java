/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package siomd;

import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author SIO2
 */
public class Coop {
    // retourne le prix des grands crus à 100%, pour l’année, fixé par le CIVC  
    public static double Prix_100 = 8.65;
    // retourne la valeur du quota par hectare décidé, pour l’année, fixé par le CIVC 
    public static int Quota = 100;

    private Map<Integer, Commune> mesCommunes;
    private Map<String, Cooperateur> mesCooperateurs;

    // retourne un itérateur pour les coopérateurs 
    public Iterator getIterCooperateurs() {
        return mesCooperateurs.values().iterator();
    }

    public Coop(Map<Integer, Commune> desCommunes, Map<String, Cooperateur> desCooperateurs) {
        mesCommunes = desCommunes;
        mesCooperateurs = desCooperateurs;
    }

    // retourne le montant total des rendements à verser aux coopérateurs
    //  parcourir les coopérateurs et cumuler le rendement de chaque coopérateur
    public double SommeAVerser() {
        double sommeAVerser = 0;
        for(Cooperateur unCooperateur : mesCooperateurs.values()) {
            sommeAVerser += unCooperateur.rendement();
        }
        return sommeAVerser;
    }

}
