/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesanimaux3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author delio
 */
public class LesAnimaux3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // créer 3 objets de la classe Chat
        Chat felix = new Chat("Félix", "persan", LocalDate.of(2009, 6, 15));
        Chat sylvestre = new Chat("Sylvestre", "gouttiére", LocalDate.of(2010, 5, 23));
        Chat isidore = new Chat("Isidore", "siamois", LocalDate.of(2006, 9, 18));

        // créer 3 objets de la classe Poisson
        Poisson nemo = new Poisson("Nemo", "clown", LocalDate.of(2012, 6, 15), 6);
        Poisson theo = new Poisson("Théo", "guppi", LocalDate.of(2010, 5, 23), 8);
        Poisson curieux = new Poisson("Curieux", "discus", LocalDate.of(2011, 9, 18), 4);

        //créer une collection générique
        // ArrayList<Animal> : collection d'animaux de la classe Animal
        List<Animal> mesAnimaux = new ArrayList<Animal>();

        //ajouter des objets à la collection
        //on peut y ajouter des objets des classes filles de Animal
        //cad des obkets de la hiérarchie de classes Animal, donc ici Chat et Poisson
        mesAnimaux.add(felix);
        mesAnimaux.add(nemo);
        mesAnimaux.add(sylvestre);
        mesAnimaux.add(isidore);
        mesAnimaux.add(theo);
        mesAnimaux.add(curieux);

        Chat leChat = new Chat("Minet", "gouttières", LocalDate.of(20211,6,23));
        Poisson lePoisson = new Poisson("Titou", "clown", LocalDate.of(2013,3,25), 6);

        //Animal est la classe de base de Chat et Poisson
        Animal unAnimalDeBase;

        unAnimalDeBase = leChat; //acceoté car le chat est un Animal
        // leChat = unAnimaldeBasse;  refusé, pas de convertions implicite, l'animal ne peut pas se transformer en chat
        leChat = (Chat)unAnimalDeBase; //conversion explicite

        //afficher les animaux de la collection
        System.out.println("=== MES ANIMAUX ===");
        for (Animal unAnimal : mesAnimaux) {
            System.out.println(unAnimal.decrire());
        }

        System.out.println("Nombre d'animaux : " + mesAnimaux.size());

        int nbChats = 0;
        int nbPoissons = 0;
        int ageTotal = 0;
        int nbAgePlusDeuxAns = 0;
        for (Animal unAnimal : mesAnimaux) {
            if (unAnimal instanceof Chat) {
                nbChats++;
            } else {
                nbPoissons++;
            }
            ageTotal += unAnimal.getAge();
            if (unAnimal.getAge() > 2) {
                nbAgePlusDeuxAns++;
            }
        }
        System.out.printf("\nNombre de chats : %d\nNombre de poissons : %d", nbChats, nbPoissons);
        System.out.printf("Moyenne d'âge des animaux : %f", ageTotal/mesAnimaux.size());
        System.out.println("Nombre d'animaux de plus de 2 ans : " + nbAgePlusDeuxAns);
    }
}
