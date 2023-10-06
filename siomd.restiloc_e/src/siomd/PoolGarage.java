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
public class PoolGarage extends Expertise {

    //Constructeur  
    public PoolGarage(String unCodeDossier, LocalDate uneDateHeure, String unLieu,
            String uneAdresse, String uneImmat, String uneMarque, String unModele) {
                super(unCodeDossier, uneDateHeure, unLieu, uneAdresse, uneImmat, uneMarque, unModele);
    }

}
