import java.time.LocalDate;
import java.time.Period;

public class Chat {
    // champ statique (à portée classe et non instance)
    private static String miaulement = "Miaou";

    // accesseur statique  (à portée classe et non instance)
    public static String getMiaulement() {
        return Chat.miaulement; 
    }

    // champs, attributs
    private String nom;
    private String race;
    private LocalDate dateNaissance;
    private String cri;

    // accesseurs 
    public String getNom() {
        return nom; 
    }

    public String getRace() {
        return race; 
    }

    public int getAge() {
        LocalDate aujourdhui = LocalDate.now();
        return Period.between(dateNaissance, aujourdhui).getYears();
    }

    // constructeur surchargé = redéfini avec le même nom mais une liste de paramètres différente
    public Chat(String pNom, String pRace, LocalDate pDateNaissance) {
        nom = pNom;
        race = pRace;
        dateNaissance = pDateNaissance;
        // cri = "Miaou";
        cri = Chat.miaulement;
    }

    // constructeur surchargé = redéfini avec le même nom mais une liste de paramètres différente
    public Chat(String pNom, String pRace, LocalDate pDateNaissance, String pCri) {
        nom = pNom;
        race = pRace;
        dateNaissance = pDateNaissance;
        cri = pCri;
    }

    // méthode surchargée = redéfinie avec le même nom mais une liste de paramètres différente
    public String miauler() {
        return cri + " !";
    }

    // méthode surchargée = redéfinie avec le même nom mais une liste de paramètres différente
    public String miauler(int nombre) {
        String uneChaine = "";
        if (nombre > 0)
        {
            for (int i = 1; i <= nombre; i++)
            {
                uneChaine += cri + " ";
            }
        }
        return uneChaine;
    }

    public String decrire() {
        //  this désigne l’objet courant, celui qui a reçu le message, dans notre exemple,
        // c’est l’objet felix
        return String.format("%s chat de %d ans de race %s. Son cri est %s", nom, getAge(), race, cri);
    }

}
