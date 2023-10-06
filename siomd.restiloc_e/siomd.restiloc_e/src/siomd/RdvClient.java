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
public class RdvClient extends Expertise {

    private String nomContact;
    private String telephone;
    private String mail;

//Constructeur qui permet d'instancier une expertise de type RDV client
    public RdvClient(String unCodeDossier, LocalDate uneDateHeure, String unLieu,
            String uneAdresse, String uneImmat, String uneMarque, String unModele, String unNomContact, String unTelephone, String unMail) {
    }

    // retourne la description de l'expertise client
    // (code dossier, date Rdv, lieu rdv, adresse, immatriculation, marque, modele, nom contact, téléphone)
    public String decrire() {
    }

}
