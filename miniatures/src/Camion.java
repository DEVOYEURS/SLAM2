public class Camion extends Miniature {
    
    public Camion(int pAnneeSortie, String pCouleur, boolean pEndommage, String pMarque, String pNom, boolean pRare) {
        super(pAnneeSortie, pCouleur, pEndommage, pMarque, pNom, pRare);
    }

    public String decrire() {
        return String.format("%s sortie en %d, marque %s, couleur %s", getNom(), getAnneeSortie(), getMarque(), getCouleur());
    }
//(⓿_⓿)
}
