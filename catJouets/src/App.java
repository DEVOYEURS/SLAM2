import java.util.HashMap;
import java.util.Map;

public class App {
    
    private static Catalogue monCatalogue;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        monCatalogue = new Catalogue("2023");

        // créer des tranches d'âge
        TrancheAge tranche1 = new TrancheAge(1, 3, 7);
        TrancheAge tranche2 = new TrancheAge(2, 7, 12); 
        TrancheAge tranche3 = new TrancheAge(3, 12, 16);
        TrancheAge tranche4 = new TrancheAge(4, 16, 18);

        // créer des catégories
        Categorie categ1 = new Categorie(1, "jeu de société");
        Categorie categ2 = new Categorie(2, "jeu de construction");
        Categorie categ3 = new Categorie(3, "éducatif");

        // créer des jouets et les ajouter à leur catégorie
        Jouet jouet1 = new Jouet(1, "Cluedo junior", categ1, tranche3);
        Jouet jouet2 = new Jouet(2, "Mecano", categ2, tranche3);
         
        // ajouter les jouets au catalogue avec leur quantité
        monCatalogue.ajouterJouet(jouet1, 10);
        monCatalogue.ajouterJouet(jouet2, 15);

        // afficher le catalogue
        System.out.printf("CATALOGUE DE JOUETS %s\n", monCatalogue.getAnnee());
        System.out.println("========================");
        
        HashMap<Jouet, Integer> lesJouets = monCatalogue.getLesJouets(); // récupère le catalogue
        for (Map.Entry<Jouet, Integer> jouet : lesJouets.entrySet()) {
            System.out.printf("\n %s - quantité : %d", jouet.getKey().getInfos(), jouet.getValue());
        }

        // afficher les statistiques par catégorie
        System.out.println("\n\nSTATISTIQUE par catégorie");
        System.out.println("=========================");

        HashMap<Categorie, Integer> lesStatsCateg = monCatalogue.statCateg();
        lesStatsCateg.forEach((uneCategorie, uneQuantite) -> {
            System.out.printf("\n%s : %d jouet(s)", uneCategorie.getLibelle(), uneQuantite);
        });

    }

}
