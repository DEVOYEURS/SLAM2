import java.time.LocalDate; // classe technique
import java.time.Period;

public class Chat { // classe métier -> type de données abstrait
    private String nom;
    private String race;
    private LocalDate dateNaissance; // attibuts ou champs
    private String cri;

    // champ statique (à portée classe et non instance)
    private static String miaulement = "Miaou";

    public Chat(String pNom, String pRace, LocalDate pDateNaissance) {
        nom = pNom;
        race = pRace;
        dateNaissance = pDateNaissance;
        cri = Chat.miaulement;
    }

    // constructeur surchargé
    public Chat(String pNom, String pRace, LocalDate pDateNaissance, String pCri) {
        nom = pNom;
        race = pRace;
        dateNaissance = pDateNaissance;
        cri = pCri;
    }

    // accesseur ou getters
    public String getNom() {
        return this.nom; // this -> l'objet courrant ; pas obligatoire en java 
    }

    public String getRace() {
        return this.race;
    }

    public int getAge() {
        LocalDate aujourdhui = LocalDate.now();
        return Period.between(dateNaissance, aujourdhui).getYears();
    }

    public String decrire() {
        return String.format("%s chat de %d ans de race %s. Son cri est %s", getNom(), getAge(), getRace(), cri);
    }

    public String miauler() {
        return cri + " !";
    }

    public String miauler(int nombre) {
        String uneChaine = "";
        if (nombre > 0) {
            for (int i = 1; i <= nombre; i++) {
                uneChaine += cri + " ";
            }
        }
        return uneChaine;

    }

    // méthode statique (à portée classe et non instance)
    public static String getMiaulement() {
        return Chat.miaulement;
    }

}
