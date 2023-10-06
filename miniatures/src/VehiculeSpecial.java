public class VehiculeSpecial extends Miniature {
    
    private String specialite;

    public String getSpecialite() {
        return specialite;
    }

    public VehiculeSpecial(int pAnneeSortie, String pCouleur, boolean pEndommage, String pMarque, String pNom, boolean pRare, String pSpecialite) {
        super(pAnneeSortie, pCouleur, pEndommage, pMarque, pNom, pRare);
        specialite = pSpecialite;
    }

    public String decrire() {
        return String.format("%s sortie en %d, marque %s, couleur %s, spécialité %s", getNom(), getAnneeSortie(), getMarque(), getCouleur(), getSpecialite());
    }

}
