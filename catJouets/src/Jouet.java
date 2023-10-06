public class Jouet {
    private int numero;
    private String libelle;
    private Categorie categ;
    private TrancheAge tranche;

    public Jouet(int uneNumero, String unLibelle, Categorie uneCategorie, TrancheAge uneTranche) {
        numero = uneNumero;
        libelle = unLibelle;
        categ = uneCategorie; // pour l'association bidirectionnelle, sens Jouet --> Categorie
        tranche = uneTranche;
        categ.ajouterJouet(this); // association bidirectionnelle (trait simple) ; categ est un champ dans Jouet de type Categorie ; Categorie --> Jouet
    }

    public int getNumero() {
        return this.numero;
    }

    public String getLibelle() {
        return libelle;
    }

    public Categorie getCateg() {
        return categ;
    }

    public TrancheAge getTrancheAge() {
        return tranche;
    }

    public boolean convient(int unAge) {
        return unAge >= tranche.getAgeMin() && unAge <= tranche.getAgeMax();
    }

    public String getInfos() {
        return String.format("%s ; catégorie : %s ; âge minimum : %d; âge maximum : %d", getLibelle(), categ.getLibelle(), tranche.getAgeMin(), tranche.getAgeMax());
    }
}
