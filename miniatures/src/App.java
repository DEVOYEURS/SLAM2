import java.util.ArrayList;
import java.util.Scanner;

public class App {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        
        ArrayList<Miniature> lesMiniatures = new ArrayList<Miniature>();
        
        lesMiniatures.add(new Voiture(1950, "noir", true, "Citroen", 3, "Solido", false));
        lesMiniatures.add(new Voiture(1958, "vert", true, "Simca", 3, "Chambord", true));
        lesMiniatures.add(new Voiture(1978, "rouge", false, "Renault", 3, "Renault 4 GTL", false));
        lesMiniatures.add(new Voiture(1986, "blanc", false, "Citroen", 3, "2CV", true));

        lesMiniatures.add(new Camion(1960, "gris", false, "Berliet", "GAK benne", true));
        lesMiniatures.add(new Camion(1946, "blanc", true, "Citroen", "Type 23", false));
        lesMiniatures.add(new Camion(1978, "vert", false, "Citroen", "NEWRAY benne avec bras", false));
        
        lesMiniatures.add(new VehiculeSpecial(1978, "blanc", false, "Renault", "Espace", false, "ambulance"));
        lesMiniatures.add(new VehiculeSpecial(1978, "rouge", true, "Renault", "V18", false, "bus"));
        lesMiniatures.add(new VehiculeSpecial(1967, "rouge", true, "Citroen", "C56", false, "Camping-car"));

        int nbRares = 0;
        for (Miniature uneMiniature : lesMiniatures) {
            if (uneMiniature instanceof Voiture) {
                System.out.println("VOITURE : " + uneMiniature.decrire());
                if (uneMiniature.isRare() == true) {
                    nbRares++;
                }
            } else if (uneMiniature instanceof Camion) {
                System.out.println("CAMION : " + uneMiniature.decrire());
                if (uneMiniature.isRare() == true) {
                    nbRares++;
                }
            } else {
                System.out.println("VEHICULE SPECIAL : " + uneMiniature.decrire());
                if (uneMiniature.isRare() == true) {
                    nbRares++;
                }
            }
        }
        //(⓿_⓿)
        System.out.printf("%d véhicules dont %d véhicules rares\n", lesMiniatures.size(), nbRares);

        String uneMarque;
        do {
            System.out.print("\nMarque ? ");
            uneMarque = sc.nextLine();
            if (!uneMarque.toLowerCase().equals("citroen") && !uneMarque.toLowerCase().equals("simca") && !uneMarque.toLowerCase().equals("renault") && !uneMarque.toLowerCase().equals("berliet")) {
                System.out.println("Marque non disponible, veuillez recommencer !");
            }
        } while (uneMarque.isEmpty() || (!uneMarque.toLowerCase().equals("citroen") && !uneMarque.toLowerCase().equals("simca") && !uneMarque.toLowerCase().equals("renault") && !uneMarque.toLowerCase().equals("berliet")));
        System.out.println("\nStatistiques pour la marque " + uneMarque.toUpperCase());

        int nbVoitures = 0, nbCamions = 0, nbVehicSpe = 0, nbEndommages = 0, nbRaresMarq = 0, nbRaresNonEndo = 0;
        for (Miniature miniature : lesMiniatures) {
            if (miniature instanceof Voiture && miniature.getMarque().toLowerCase().equals(uneMarque.toLowerCase())) {
                nbVoitures++;
                if (miniature.isEndommage()) {
                    nbEndommages++;
                }
                if (miniature.isRare()) {
                    nbRaresMarq++;
                    if (!miniature.isEndommage()) {
                        nbRaresNonEndo++;
                    }
                }
            }
            if (miniature instanceof Camion && ((miniature.getMarque().toLowerCase().equals(uneMarque.toLowerCase())) {
                nbCamions++;
                if (((miniature.isEndommage()) {
                    nbEndommages++;
                }
                if (((miniature.isRare()) {
                    nbRaresMarq++;
                    if (!((miniature.isEndommage()) {
                        nbRaresNonEndo++;
                    }
                }
            }
            if (miniature instanceof VehiculeSpecial && (miniature.getMarque().toLowerCase().equals(uneMarque.toLowerCase())) {
                nbVehicSpe++;
                if ((miniature.isEndommage()) {
                    nbEndommages++;
                }
                if ((miniature.isRare()) {
                    nbRaresMarq++;
                    if (!(miniature.isEndommage()) {
                        nbRaresNonEndo++;
                    }
                }
            }
        }
        System.out.printf("\nVoitures : %d\nCamions : %d\nVéhicules spécialisés : %d\nMiniatures endommagés : %d\nMiniatures rares : %d\nMiniatures rares et non endommagées : %d\n", nbVoitures, nbCamions, nbVehicSpe, nbEndommages, nbRaresMarq, nbRaresNonEndo);
    }
}

//©UwUOwOq(≧▽≦q)（￣︶￣）↗　(👉ﾟヮﾟ)👉👈(⌒▽⌒)👉👈(ﾟヮﾟ👈)(⓿_⓿)◑﹏◐( ͡°( ͡° ͜ʖ( ͡° ͜ʖ ͡°)ʖ ͡°) ͡°)
