package lesanimaux3;

import java.time.LocalDate;
import java.time.Period;

public abstract class Animal {
    protected String nom; //protected = accessible par les classes filles
    private String race;
    private LocalDate dateNaissance;

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

    public Animal(String pNom, String pRace, LocalDate pDateNaissance) {
        nom = pNom;
        race = pRace;
        dateNaissance = pDateNaissance;
    }

    //abstract : qualificateur pour méthodes abstraites
    //pas d'implémentation (corps)
    //méthode abstraite est implicitement virtuelle
    public abstract String decrire();
}
