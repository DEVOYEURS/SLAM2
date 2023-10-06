import java.time.LocalDate;
import java.time.Period;

public class Poisson {
    private String nom;
    private String race;
    private LocalDate dateNaissance;
    private int nbNageoires;

    public Poisson(String pNom, String pRace, LocalDate pDateNaissance, int pNbNageoires) {
        nom = pNom;
        race = pRace;
        dateNaissance = pDateNaissance;
        nbNageoires = pNbNageoires;
    }

    public String getNom() {
        return this.nom;
    }

    public String getRace() {
        return this.race;
    }

    public int getAge() {
        int age = Period.between(dateNaissance, LocalDate.now()).getYears();
        return age;
    }

    public String decrire() {
        return String.format("%s est un %s de %d ans", getNom(), getRace(), getAge());
    }
}
