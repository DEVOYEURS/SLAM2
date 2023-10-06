/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package siomd;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author SIO2
 */
public class ParcelleExperimentale extends Parcelle {
    private LocalDate dateAutorisation;
    private int nbHectaresExperimental;
    private String nomLaboratoire;
    private int numAutorisation;
    
    /**
     * @return the nbHectaresExperimental
     */
    public int getNbHectaresExperimental() {
        return nbHectaresExperimental;
    }
    
    public ParcelleExperimentale(int pNumParcelle, int pNbHectares, int pQteProduction, Commune pCommune, int pNumAutorisation, LocalDate pDateAutorisation, int pNbHectaresExperimental, String pNomLaboratoire) {
        super(pNumParcelle, pNbHectares, pQteProduction, pCommune);
        numAutorisation = pNumAutorisation;
        nbHectaresExperimental = pNbHectaresExperimental;
        nomLaboratoire = pNomLaboratoire;
        if ( pDateAutorisation.isAfter(LocalDate.now()) ) {
            dateAutorisation = LocalDate.now();
        } else {
            dateAutorisation = pDateAutorisation;
        }
    }
    
    @Override
    public String decrire() {
        DateTimeFormatter monFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
         return super.decrire() + String.format("\t\t%s\t\t%d", dateAutorisation.format(monFormat), getNbHectaresExperimental());
    }
}
