/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package siomd;

import java.time.LocalDate;

/**
 *
 * @author delio
 */
public class Expertise {

    private String codeDossier;
    private LocalDate dateHeureRdv;
    private String lieuRdv;
    private String adresse;
    private String immatriculation;
    private String marque;
    private String modele;
    private Indisponibilite uneIndispo;

    //retourne l'objet de type Indisponibilite si l’expertise n’a pas pu avoir lieu
    //            ou valeur null si expertise à réaliser ou réalisée 
    public Indisponibilite getIndisponibilite() {
    }

    //Constructeur permettant de valoriser les attributs d’un objet
    public Expertise(String unCodeDossier, LocalDate uneDateHeure, String unLieu, String uneAdresse, String uneImmat, String uneMarque, String unModele) {
    }

    //Méthode qui détermine l'état de l’expertise sous la forme d'un entier
    // retourne   1 – à réaliser ; 2 – réalisée ; 3 - indisponible 
    public int etatExpertise() {
    }

    //Méthode qui permet de créer l'indisponibilité de l’expertise qui n'a pas pu avoir lieu
    public void creerIndisponibilite(String unMotif, boolean clientEstResponsable) {
    }

    // retourne la description de l'expertise
    // (code dossier, date Rdv, lieu rdv, adresse, immatriculation, marque, modele)
    public String decrire() {
    }

}
