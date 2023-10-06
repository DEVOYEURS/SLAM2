/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miniatures;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author delio
 */
public class Miniatures {
    // final
    // instanceof avec inst
    // equals
    // ArrayList : collection d'objets de la classe Object
    private static  List<Vehicule> lesMiniatures = new ArrayList<Vehicule>();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // on ajoute quelques véhicules miniatures pour le jeu d'essai   
        lesMiniatures.add(new Voiture("Solido traction 11CV", 1950, 
            "Noir", "Citroen", 3, false, false));

        lesMiniatures.add(new Voiture("Chambord", 1958, "Vert", "Simca", 3, true, false));
        lesMiniatures.add(new Voiture("Renault 4 GTL", 1978, "Rouge", "Renault", 3, false, true));
        lesMiniatures.add(new Voiture("2CV", 1986, "Blanc", "Citroen", 3, false, true));

        lesMiniatures.add(new Camion("GAK benne", 1960, "Gris", "Berliet", false, true));
        lesMiniatures.add(new Camion("Type 23", 1946, "Blanc", "Citroen", true, false));
        lesMiniatures.add(new Camion("NEWRAY benne avec bras", 1978, "Vert", "Citroen", false, false));

        lesMiniatures.add(new VehiculeSpecial("Espace", 1978, "Blanc", "Renault", "ambulance", false, true));
        lesMiniatures.add(new VehiculeSpecial("V18", 1978, "Rouge", "Renault", "Bus", false, false));
        lesMiniatures.add(new VehiculeSpecial("C56", 1967, "Rouge", "Citroen", "Camping car", true, true));

        int nbMiniaturesRares = 0;
        for (Vehicule unObjet : lesMiniatures) {
            System.out.println(unObjet.decrire());
            if (unObjet.isRare()) {
                    nbMiniaturesRares++;
            }
        }

        // afficher le nombre de miniatures et de miniatures rares
        String txtVehicule = String.format("%d véhicule", lesMiniatures.size());
        if (lesMiniatures.size() > 1) {
            txtVehicule += "s";
        }
        if (nbMiniaturesRares > 1) {
            System.out.printf("%s  dont %d véhicules rares", txtVehicule, nbMiniaturesRares);
        } else {
            System.out.printf("%s  dont %d véhicule rare", txtVehicule, nbMiniaturesRares);
        }

        // saisir un nom de marque
        Scanner input = new Scanner(System.in);
        System.out.println("\n\nMarque ? ");
        String marque = input.nextLine();

        // initialiser les compteurs
        int nbVoitures = 0, nbCamions = 0, nbVehiculesSpecialises = 0, nbEndommages = 0,
             nbRares = 0, nbRaresNonEndommages = 0;
        // parcourir la liste de miniatures
        for (Vehicule unObjet : lesMiniatures) {
            if (unObjet.isEndommage()) {
                        nbEndommages++;
                    }
                    if (unObjet.isRare()) {
                        nbRares++;
                        if (!unObjet.isEndommage()) {
                            nbRaresNonEndommages++;
                        }
                    }
            if (unObjet instanceof Voiture uneVoiture) {
                if (uneVoiture.getMarque().equals(marque)) {
                    nbVoitures++;
                    
                }
            } else if (unObjet instanceof Camion unCamion) {
                if (unCamion.getMarque().equals(marque)) {
                    nbCamions++;
                }
            } else {
                if (unObjet.getMarque().equals(marque)) {
                    nbVehiculesSpecialises++;
                }
            }
        }

        // afficher les statistiques de la marque
        System.out.printf("\n Statistiques pour la marque %s\n", marque.toUpperCase());
        System.out.printf("\tVoitures : %d\n", nbVoitures);
        System.out.printf("\tCamions : %d\n", nbCamions);
        System.out.printf("\tVéhicules spécialisés : %d\n", nbVehiculesSpecialises);
        System.out.printf("\tMiniatures endommagées : %d\n", nbEndommages);
        System.out.printf("\tMiniatures rares : %d\n", nbRares);
        System.out.printf("\tMiniatures rares et non endommagées : %d\n", nbRaresNonEndommages);

    }
}
