public abstract class Miniature {
    private int anneeSortie;
    private String couleur;
    private boolean endommage;
    private String marque;
    private String nom;
    private boolean rare;

    public int getAnneeSortie() {
        return anneeSortie;
    }

    public String getCouleur() {
        return couleur;
    }

    public boolean isEndommage() {
        return endommage;
    }

    public String getMarque() {
        return marque;
    }

    public String getNom() {
        return nom;
    }

    public boolean isRare() {
        return rare;
    }

    public Miniature(int pAnneeSortie, String pCouleur, boolean pEndommage, String pMarque, String pNom, boolean pRare) {
        anneeSortie = pAnneeSortie;
        couleur = pCouleur;
        endommage = pEndommage;
        marque = pMarque;
        nom = pNom;
        rare = pRare;
    }

    public abstract String decrire();
}
