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
public class Restiloc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // créer une société de financement
        SocieteFinancement uneSocFinanc = new SocieteFinancement("G1258", "Cofaco");
        // ajouter une 1ere expertise PoolGarage réalisée (date dépassée et pas d'indisponibilité)
        uneSocFinanc.ajouterExpertisePool("Dupont542", LocalDate.of(2021, 7, 15), "Garage Dido Metz", "3 rue des lilas", "506FTG57", "Peugeot", "SUV 2008");
        // ajouter une 2e expertise PoolGarage à réaliser (date non dépassée et pas d'indisponibilité)
        uneSocFinanc.ajouterExpertisePool("Franchon458", LocalDate.of(2021, 11, 28), "Garage Fonsi Nancy", "43 rue Victor Hugo", "AB-452-DR", "Citroen", "C4");
        // ajouter une 3e expertise PoolGarage à réaliser (date non dépassée et pas d'indisponibilité) 
        uneSocFinanc.ajouterExpertisePool("Benoist453", LocalDate.of(2021, 12, 10), "Garage Dido Metz", "3 rue des lilas", "DF-125-DR", "Citroen", "C3");
        // ajouter une 4e expertise PoolGarage à réaliser (date non dépassée et pas d'indisponibilité) 
        uneSocFinanc.ajouterExpertisePool("Lindon458", LocalDate.of(2021, 11, 6), "Garage Fonsi Nancy", "43 rue Victor Hugo", "AB-452-DR", "Renault", "Captur");
        // ajouter une indisponibilité de type "Véhicule absent" sur la 2e expertise PoolGarage
        uneSocFinanc.getLesExpertises().get(1).creerIndisponibilite("Véhicule absent", true);
        // ajouter une indisponibilité de type "Véhicule inacessible" sur la 3e expertise PoolGarage
        uneSocFinanc.getLesExpertises().get(2).creerIndisponibilite("Véhicule inacessible", true);

        // ajouter une 1ere expertise RdvClient réalisée (date dépassée et pas d'indisponibilité)
        uneSocFinanc.ajouterExpertiseClient("Ambrecht458", LocalDate.of(2021, 5, 20), "Metz", "18 rue acacias", "HJ-452-OP", "Citroen", "C3", "Gina Ambrecht", "0615212358", "gina@gmail.com");
        // ajouter une 2e expertise RdvClient à réaliser (date non dépassée et pas d'indisponibilité)
        uneSocFinanc.ajouterExpertiseClient("Schmitt145", LocalDate.of(2021, 11, 14), "Nancy", "29 rue des roses", "KK-789-DR", "Citroen", "C4", "Vivien Schmitt", "0612488521", "vivien@gmail.com");
        // ajouter une 3e expertise RdvClient à réaliser (date non dépassée et pas d'indisponibilité) 
        uneSocFinanc.ajouterExpertiseClient("Alexis458", LocalDate.of(2021, 11, 23), "Nancy", "9 rue des tilleuls", "LL-436-DR", "Citroen", "C4", "Simon Alexis", "0612458521", "simon@gmail.com");
        // ajouter une 4e expertise RdvClient à réaliser (date non dépassée et pas d'indisponibilité) 
        uneSocFinanc.ajouterExpertiseClient("Timson359", LocalDate.of(2021, 11, 5), "Metz", "10 rue des campanules", "ER-357-DR", "Renault", "Clio", "Vero Timson", "0612458981", "timson@gmail.com");
        // ajouter une indisponibilité de type "Véhicule absent" sur la 2e expertise RdvClient (la 6e de la lste)
        uneSocFinanc.getLesExpertises().get(5).creerIndisponibilite("Véhicule absent", true);
        // ajouter une indisponibilité de type "Client absent" sur la 3e expertise RdvClient (la 7e de la lste)
        uneSocFinanc.getLesExpertises().get(6).creerIndisponibilite("Client absent", true);

        // afficher  les expertises indisponibles
        System.out.println("===  EXPERTISES INDISPONIBLES  ===");
        //    **************** A COMPLETER

        // afficher le nombre d'indisponibilités avec motif "Véhicule absent"
        //    **************** A COMPLETER
    }

}
