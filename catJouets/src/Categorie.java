import java.util.ArrayList;

public class Categorie {
    private int code; 
    private String libelle;
    private ArrayList<Jouet> lesJouets;

    public Categorie(int pCode, String pLibelle){
        code = pCode;
        libelle = pLibelle;
    }

    public int getCode() {
        return code;
    }

    public String getLibelle() {
        return libelle;
    }

    public void ajouterJouet(Jouet unJouet) {
        lesJouets.add(unJouet);
    }
}
