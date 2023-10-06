/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package siomd;

/**
 *
 * @author delio
 */
public class Indisponibilite {

    private String motif_dcln;
    private boolean clientResponsable_dcln;

    //retourne le motif de l'indisponibilité
    public String getMotif_dcln() {
        return motif_dcln;
    }

    // indique si le client est responsable ou non de l’indisponibilité 
    public boolean isClientResponsable_dcln() {
        return clientResponsable_dcln;
    }

    //Constructeur 
    public Indisponibilite(String unMotif_dcln, boolean clientEstResponsable_dcln) {
        motif_dcln = unMotif_dcln;
        clientResponsable_dcln = clientEstResponsable_dcln;
    }

}
