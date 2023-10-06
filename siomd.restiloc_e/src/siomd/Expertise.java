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

    private String codeDossier_dcln;
    private LocalDate dateHeureRdv_dcln;
    private String lieuRdv_dcln;
    private String adresse_dcln;
    private String immatriculation_dcln;
    private String marque_dcln;
    private String modele_dcln;
    private Indisponibilite uneIndispo_dcln;

    //retourne l'objet de type Indisponibilite si l’expertise n’a pas pu avoir lieu
    //            ou valeur null si expertise à réaliser ou réalisée 
    public Indisponibilite getIndisponibilite_dcln() {
        if (uneIndispo_dcln != null) {
            return uneIndispo_dcln;
        } else {
            return null;
        }
    }

    //Constructeur permettant de valoriser les attributs d’un objet
    public Expertise(String unCodeDossier_dcln, LocalDate uneDateHeure_dcln, String unLieu_dcln, String uneAdresse_dcln, String uneImmat_dcln, String uneMarque_dcln, String unModele_dcln) {
        codeDossier_dcln = unCodeDossier_dcln;
        dateHeureRdv_dcln = uneDateHeure_dcln;
        lieuRdv_dcln = unLieu_dcln;
        adresse_dcln = uneAdresse_dcln;
        immatriculation_dcln = uneImmat_dcln;
        marque_dcln = uneMarque_dcln;
        modele_dcln = unModele_dcln;
        
    }

    //Méthode qui détermine l'état de l’expertise sous la forme d'un entier
    // retourne   1 – à réaliser ; 2 – réalisée ; 3 - indisponible 
    public int etatExpertise_dcln() {
        if (dateHeureRdv_dcln.isAfter(LocalDate.now())) {
            return 1;
        } else if (dateHeureRdv_dcln.isBefore(LocalDate.now())) {
            return 2;
        } else {
            return 3;
        }
    }

    //Méthode qui permet de créer l'indisponibilité de l’expertise qui n'a pas pu avoir lieu
    public void creerIndisponibilite_dcln(String unMotif, boolean clientEstResponsable) {
        uneIndispo_dcln = new Indisponibilite(unMotif, clientEstResponsable);
    }

    // retourne la description de l'expertise
    // (code dossier, date Rdv, lieu rdv, adresse, immatriculation, marque, modele)
    public String decrire_dcln() {
        return String.format("%s - %s - %s - %s - %s - %s - %s", codeDossier_dcln, dateHeureRdv_dcln, lieuRdv_dcln, adresse_dcln, immatriculation_dcln, marque_dcln, modele_dcln);
    }

}
