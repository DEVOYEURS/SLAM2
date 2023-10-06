/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package siomd;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author delio
 */
public class SocieteFinancement {

    private String code_dcln;
    private String nom_dcln;
    private List<Expertise> lesExpertises_dcln;

    public List<Expertise> getLesExpertises_dcln() {
        return lesExpertises_dcln;
    }

    // Constructeur qui valorise les attributs privés et crée la collection lesExpertises
    public SocieteFinancement(String unCodeSL, String unNomSL) {
        code_dcln = unCodeSL;
        nom_dcln = unNomSL;
        lesExpertises_dcln = new ArrayList<>();
    }

    // ajoute une expertise client à la liste des expertises
    public void ajouterExpertiseClient_dcln(String unDossier, LocalDate uneDateHeure, String unLieu, String uneAdresse, String unImmat, String uneMarque, String unModele, String unContact, String unTelephone, String unMail) {
        lesExpertises_dcln.add(new RdvClient(unDossier, uneDateHeure, unLieu, uneAdresse, unImmat, uneMarque, unModele, unContact, unTelephone, unMail));
    }

    //permet d’ajouter une nouvelle expertise de type PoolGarage à la collection des expertises d’une société de financement
    public void ajouterExpertisePool_dcln(String unDossier, LocalDate uneDateHeure, String unLieu,
            String uneAdresse, String unImmat, String uneMarque, String unModele) {
                lesExpertises_dcln.add(new PoolGarage(unDossier, uneDateHeure, unLieu, uneAdresse, unImmat, uneMarque, unModele));
    }

    // retourne la liste de toutes les expertises qui ont donné lieu à une indisponibilité.
    public List<Expertise> lesExpertisesIndispos_dcln() {
        List<Expertise> mesExpertisesIndispo_dcln = new ArrayList<Expertise>();
        for (Expertise uneExpertise_dcln : lesExpertises_dcln) {
            if (uneExpertise_dcln.getIndisponibilite_dcln() != null) {
                mesExpertisesIndispo_dcln.add(uneExpertise_dcln);
            }
        }
        return mesExpertisesIndispo_dcln;
    }

    // retourne le nombre d’expertises indisponibles correspondant au motif passé en paramètre.
    public int nbIndisponibilites_dcln(String leMotif) {
        int nbIndispos_dcln = 0;
        for (Expertise uneExpertise_dcln : lesExpertises_dcln) {
            if (uneExpertise_dcln.getIndisponibilite_dcln().getMotif_dcln().equals(leMotif)) {
                nbIndispos_dcln++;
            }
        }
        return nbIndispos_dcln;
    }

}
