import java.util.HashMap;

public class Catalogue {
    private String annee;
    private HashMap<Jouet, Integer> lesJouets;

    public Catalogue(String uneAnnee) {
        annee = uneAnnee;
        lesJouets = new HashMap<>();
    }

    public String getAnnee() {
        return annee;
    }

    public HashMap<Jouet, Integer> getLesJouets() {
        return lesJouets;
    }

    public int quantiteDistribuee() {
        int qteTotale = 0;
        for (Integer uneQuantite : lesJouets.values()) {
            qteTotale += uneQuantite;
        }
        return qteTotale;
    }

    public boolean ajouterJouet(Jouet unJouet, int uneQuantite) {
        try {
            lesJouets.put(unJouet, uneQuantite);
            return true;
        } catch (Exception e) {
            return false;   
        }
    }

    public HashMap<Categorie, Integer> statCateg() {
        HashMap<Categorie, Integer> desStatsCateg = new HashMap<>();
        
        // parcourir le dictionnaire de jouets
        // for (Map.Entry<Jouet, Integer> entree : lesJouets.entrySet()) { // entree = couple key et value | entree.getKey() = objet
        //     // si la catégorie du jouet existe déjà dans le dictionnaire des stats
        //     // alors ajouter la quantité de jouets à la quantité de catégorie
        //     if (desStatsCateg.containsKey(entree.getKey().getCateg())) {
        //         int qteTotale = entree.getValue() + desStatsCateg.get(entree.getKey().getCateg());
        //         desStatsCateg.replace(entree.getKey().getCateg(), qteTotale);
        //     } else { // sinon créer la catégorie dans le dictionnaire des stats avec la quantité de jouets
        //         desStatsCateg.put(entree.getKey().getCateg(), entree.getValue());
        //     } 
        // }
        // return desStatsCateg;

        lesJouets.forEach((unJouet, uneQuantite) -> {
            if (desStatsCateg.containsKey(unJouet.getCateg())) {
                int qteTotale = uneQuantite + desStatsCateg.get(unJouet.getCateg());
                desStatsCateg.replace(unJouet.getCateg(), qteTotale);
            } else { // sinon créer la catégorie dans le dictionnaire des stats avec la quantité de jouets
                desStatsCateg.put(unJouet.getCateg(), uneQuantite);
            } 
        });
        return desStatsCateg;
    }

}
