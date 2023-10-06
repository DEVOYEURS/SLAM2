// ajouter nom pour les menus -> menu personnalisé

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class App {
    private static Scanner sc = new Scanner(System.in);

    public static int nbRandom(int unNombre) { //limite exclu
        Random r = new Random();
        int n = r.nextInt(unNombre);
        return n;
    }

    public static void main(String[] args) throws Exception {
        
        List<String> lesViandes = new ArrayList<>();
        lesViandes.add("poulet nature");
        lesViandes.add("poulet mariné");
        lesViandes.add("viande haché");
        lesViandes.add("tenders de poulet");
        lesViandes.add("merguez");
        lesViandes.add("nuggets");
        lesViandes.add("cordon bleu");
        lesViandes.add("kebab");

        List<String> lesSauces = new ArrayList<>();
        lesSauces.add("barbecue");
        lesSauces.add("algérienne");
        lesSauces.add("burger");
        lesSauces.add("chili Thaï");
        lesSauces.add("curry");
        lesSauces.add("fuego");
        lesSauces.add("ketchuo");
        lesSauces.add("mayonnaise");
        lesSauces.add("samouraï");
        lesSauces.add("dallas");
        lesSauces.add("joppie");
        lesSauces.add("brésil");

        List<String> lesSupplements = new ArrayList<>();
        lesSupplements.add("chèvre");
        lesSupplements.add("cheddar");
        lesSupplements.add("gouda");
        lesSupplements.add("raclette");
        lesSupplements.add("vache qui rit");
        lesSupplements.add("boursin");
        lesSupplements.add("mozzarella");
        lesSupplements.add("oignons caramélisés");
        lesSupplements.add("boeuf façon bacon fumé");
        lesSupplements.add("champignons");
        lesSupplements.add("tranches de poulet");
        lesSupplements.add("poivronnade");
        lesSupplements.add("lardons de volaille");
        lesSupplements.add("jalapeno & Cheese nuggets");
        lesSupplements.add("galette de pommes de terre");

        List<String> lesGarnituresFromage = new ArrayList<>();
        lesGarnituresFromage.add("cheddar");
        lesGarnituresFromage.add("gouda");
        lesGarnituresFromage.add("raclette");
        lesGarnituresFromage.add("mozzarella");

        List<String> lesGarnitures = new ArrayList<>();
        lesGarnitures.add("champignons");
        lesGarnitures.add("boeuf facon bacon fumé");
        lesGarnitures.add("poivronnade");
        lesGarnitures.add("lardons de volaille");
        lesGarnitures.add("oignons caramélisés");

        //combien d'utilisateur 
        System.out.println("Combien de tacos ?");
        int nbTacos = sc.nextInt();
        for (int i = 0; i < nbTacos; i++){

            //sélection de la taille par l'utilisateur
            int uneTaille = 0;
            do {
                System.out.println("\nCombien de viandes ? 1 - 2 - 3 : ");
                uneTaille = sc.nextInt();
            } while (uneTaille > 3 || uneTaille < 1);

            //tirage de la viande selon taille 
            if (uneTaille == 1) {
                System.out.println("\nViande : " + lesViandes.get(nbRandom(lesViandes.size())));
            } else if (uneTaille == 2) {
                String viande1 = lesViandes.get(nbRandom(lesViandes.size()));
                String viande2 = lesViandes.get(nbRandom(lesViandes.size()));
                while (viande2.equals(viande1)) {
                    viande2 = lesViandes.get(nbRandom(lesViandes.size()));
                }
                System.out.printf("\nViandes : %s - %s", viande1, viande2);
            } else {
                String viande1 = lesViandes.get(nbRandom(lesViandes.size()));
                String viande2 = lesViandes.get(nbRandom(lesViandes.size()));
                String viande3 = lesViandes.get(nbRandom(lesViandes.size()));
                while (viande2.equals(viande1) || viande2.equals(viande3) || viande3.equals(viande1)) {
                    viande2 = lesViandes.get(nbRandom(lesViandes.size()));
                    viande3 = lesViandes.get(nbRandom(lesViandes.size()));
                }
                System.out.printf("\nViandes : %s - %s - %s", viande1, viande2, viande3);
            }

            //tirage de 2 sauces 
            String sauce1 = lesSauces.get(nbRandom(lesSauces.size()));
            String sauce2 = lesSauces.get(nbRandom(lesSauces.size()));
            while (sauce2.equals(sauce1)) {
                sauce2 = lesSauces.get(nbRandom(lesSauces.size()));
            }
            System.out.printf("\nSauces : %s - %s", sauce1, sauce2);

            //supplément oui/non + tirage éventuel
            int choixSupplement = nbRandom(2);
            if (choixSupplement == 0) {
                System.out.println("\nPas de suppélement");
            } else {
                int nbSupp = nbRandom(4);
                System.out.println("\nSupplément(s) : ");
                for (int j = 0; j < nbSupp; j++) {
                    System.out.println(lesSupplements.get(nbRandom(lesSupplements.size())) + " ");
                }
            }

            //garniture oui/non + tirage eventuel
            int choixGarniture = nbRandom(2);
            if (choixGarniture == 0) {
                System.out.println("\nPas de garniture");
            } else {
                String garniture = lesGarnitures.get(nbRandom(lesGarnitures.size()));
                String garnitureFrom = lesGarnituresFromage.get(nbRandom(lesGarnituresFromage.size()));
                System.out.printf("\nGarnitures : %s - %s", garniture, garnitureFrom);
            }

            System.out.println("\n");
        }
    }
}