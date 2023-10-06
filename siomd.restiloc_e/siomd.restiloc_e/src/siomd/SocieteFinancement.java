/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package siomd;

import java.util.List;

/**
 *
 * @author delio
 */
public class SocieteFinancement {

    private String code;
    private String nom;
    private List<Expertise> lesExpertises;

    public List<Expertise> getLesExpertises() {
        return lesExpertises;
    }

    // Constructeur qui valorise les attributs privés et crée la collection lesExpertises
    public SocieteFinancement(String unCodeSL, String unNomSL) {
    }

    // ajoute une expertise client à la liste des expertises
    public void ajouterExpertiseClient(String unDossier, LocalDate uneDateHeure, String unLieu, String uneAdresse, String unImmat, String uneMarque, String unModele, String unContact, String unTelephone, String unMail) {
    }

    //permet d’ajouter une nouvelle expertise de type PoolGarage à la collection des expertises d’une société de financement
    public void ajouterExpertisePool(String unDossier, LocalDate uneDateHeure, String unLieu,
            String uneAdresse, String unImmat, String uneMarque, String unModele) {
    }

    // retourne la liste de toutes les expertises qui ont donné lieu à une indisponibilité.
    public List<Expertise> lesExpertisesIndispos() {
    }

    // retourne le nombre d’expertises indisponibles correspondant au motif passé en paramètre.
    public int nbIndisponibilites(String leMotif) {
    }

}
