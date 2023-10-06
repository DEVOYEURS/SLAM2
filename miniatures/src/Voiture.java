public class Voiture extends Miniature{
//(⓿_⓿)
    private int nbPortes;

    public int getNbPortes() {
        return nbPortes;
    }

    public Voiture(int pAnneeSortie, String pCouleur, boolean pEndommage, String pMarque, int pNbPortes, String pNom, boolean pRare) {
        super(pAnneeSortie, pCouleur, pEndommage, pMarque, pNom, pRare);
        nbPortes = pNbPortes;
    }

    public String decrire() {
        return String.format("%s sortie en %d, marque %s, couleur %s, nombre de porte : %d", getNom(), getAnneeSortie(), getMarque(), getCouleur(), getNbPortes());
    }
}
