import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Iterator;

public class App {
    public static void main(String[] args) throws Exception {

        // créer 3 objets de la classe Chat
        Chat felix = new Chat("Félix", "persan", LocalDate.of(2009, 6, 15));
        Chat sylvestre = new Chat("Sylvestre", "gouttiére", LocalDate.of(2010, 5, 23));
        Chat isidore = new Chat("Isidore", "siamois", LocalDate.of(2006, 9, 18));

        // créer un liste de chats
        List<Chat> mesChats = new ArrayList<Chat>();

        // ajouter les chats à la liste
        mesChats.add(felix);
        mesChats.add(sylvestre);
        mesChats.add(isidore);

        // afficher les chats de la liste
        System.out.println("\n=== MES CHATS ===");
        for (Chat unChat : mesChats) {
            System.out.println(unChat.decrire());
        }

        // parcourir la liste avec un itérateur
        System.out.printf("\n=== MES CHATS === parcours avec itérateur\n");
        for (int i = 0; i < mesChats.size(); i++) {
            System.out.println(mesChats.get(i).decrire());
        }

        // afficher le nombre d'éléments (cardinal) de la liste
        System.out.printf("\nNombre de chats : %d\n", mesChats.size());

        System.out.println("\n------ POISSONS ------");

        // créer 3 objets de la classe Poisson
        Poisson nemo = new Poisson("Nemo", "clown", LocalDate.of(2012, 6, 15), 6);
        Poisson theo = new Poisson("Théo", "guppi", LocalDate.of(2010, 5, 23), 8);
        Poisson curieux = new Poisson("Curieux", "discus", LocalDate.of(2011, 9, 18), 4);

        // créer un dictionnaire de poissons (ou map)
        Map<String, Poisson> mesPoissons = new HashMap<String, Poisson>();

        // ajouter les poissons au dictionnaire
        // on précise la valeur de la clé (ici nom du poisson)
        // et l'objet Poisson à ajouter
        mesPoissons.put(nemo.getNom(), nemo);
        mesPoissons.put(theo.getNom(), theo);
        mesPoissons.put(curieux.getNom(), curieux);

        // afficher les poissons du dictionnaire
        // on parcourt les valeurs du dictionnaire (mesPoissons.values)
        System.out.println("\n=== MES POISSONS ===  boucle for Poisson");
        for (Poisson unPoisson : mesPoissons.values()) {
            System.out.println(unPoisson.decrire());
        }

        // FUCK U <3 x) :)

        // afficher les poissons du dictionnaire
        // on parcourt les clés du dictionnaire (mesPoissons.keySet)
        System.out.println("\n=== MES POISSONS ===  boucle for String");
        for (String nomPoisson : mesPoissons.keySet()) {
            System.out.printf("%s  = %s\n", nomPoisson, mesPoissons.get(nomPoisson).decrire());
        }

        // afficher les poissons du dictionnaire : parcours avec boucle for
        // entrySet() retourne le set (ensemble) des entrées <String, Poisson>
        System.out.println("\n=== MES POISSONS ===  boucle for Map.Entry");
        for (Map.Entry<String, Poisson> entree : mesPoissons.entrySet()) {
            System.out.printf("\n clé : %s - valeur.decrire : %s",
                    entree.getKey(), entree.getValue().decrire());
        }

        // afficher les poissons du dictionnaire : parcours avec boucle while et
        // iterator
        System.out.println("\n=== MES POISSONS ===  boucle while et iterator");
        Iterator<Map.Entry<String, Poisson>> iterator = mesPoissons.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Poisson> mapentry = (Map.Entry<String, Poisson>) iterator.next();
            System.out.println("clé: " + mapentry.getKey()
                    + " | valeur: " + mapentry.getValue().decrire());
        }

        System.out.printf("Nombre de poissons : %d\n", mesPoissons.size());

        // afficher theo
        System.out.printf("\nAffichage de Théo à partir du dictionnaire :");
        System.out.printf("\t %s", mesPoissons.get("Théo").decrire());

        // chercher un poisson à partir de son nom saisi
        Scanner input = new Scanner(System.in);
        System.out.println("\n\n Entrez le nom d'un poisson à afficher");
        String nomPoisson = input.nextLine();
        // l'indexeur provoque une exception si la clé demandée
        // n'est pas dans le dictionnaire
        try {
            System.out.printf(mesPoissons.get(nomPoisson).decrire());
        } catch (Exception e) {
            System.out.printf("Le poisson %s n'existe pas !", nomPoisson);
        }


        // créer une collection d'objets
        // ArrayList : collection d'objets de la classe Object
        ArrayList<Object> mesAnimaux = new ArrayList<Object>();

        // ajouter des objets à la collection non générique
        // on peut y ajouter des objets de différentes classes, ici 2 chats et un
        // poisson
        mesAnimaux.add(felix);
        mesAnimaux.add(nemo);
        mesAnimaux.add(sylvestre);

        // ça fonctionne car un chat est aussi un objet, un poisson est aussi un objet
        Chat leChat = new Chat("Minet", "gouttiére", LocalDate.of(2011, 6, 23));
        Poisson lePoisson = new Poisson("Titou", "clown", LocalDate.of(2013, 3, 25), 6);
        // Object est la classe de base de tous les objets
        Object objet;

        objet = leChat; // accepté, le chat est aussi un objet
        // leChat = objet; // refusé, pas de conversion implicite,
        // l'objet ne peut pas se transformer en chat

        objet = lePoisson; // accepté
        // lePoisson = objet; // refusé, pas de conversion implicite,
        // l'objet ne peut pas se transformer en poisson

        // afficher les animaux de la collection non générique
        // il faut tester le type de chaque objet avec l'opérateur instanceof
        // puis effectuer un transtypage explicite, un cast, avec (nomClasse)
        System.out.printf("\n\n=== MES ANIMAUX ===");
        for (Object unObjet : mesAnimaux) {
            if (unObjet instanceof Chat) {
                System.out.printf("\nanimal : %s", ((Chat) unObjet).decrire());
            } else {
                System.out.printf("\nanimal : %s", ((Poisson) unObjet).decrire());
            }
        }

        // afficher le nombre d'éléments (cardinal) de la collection
        System.out.printf("\nNombre d'animaux : %d", mesAnimaux.size());

        // compter les chats et les poissons
        int nbChat = 0;
        int nbPoisson = 0;
        for (Object unObjet : mesAnimaux) {
            if (unObjet instanceof Chat) {
                nbChat++;
            } else {
                nbPoisson++;
            }
        }
        System.out.printf("\nNombre chats : %d\nNombre poissons : %d", nbChat, nbPoisson);

        //calculer et afficher la moyenne d'âge des animaux
        // compter le nombre d'animaux de plus de 2 ans
        int totalAge = 0;
        int nbAnimDeuxAns = 0;
        for (Object unObjet : mesAnimaux) {
            if (unObjet instanceof Chat) {
                totalAge += ((Chat) unObjet).getAge();
                if (((Chat) unObjet).getAge() > 2) {
                    nbAnimDeuxAns++;
                }
            } else {
                totalAge += ((Poisson) unObjet).getAge();
                if (((Poisson) unObjet).getAge() > 2) {
                    nbAnimDeuxAns++;
                }
            }
        }
        System.out.printf("\nLa moyenne d'âge des animaux est de %f.\n%d animaux ont plus de 2 ans", totalAge/mesAnimaux.size(), nbAnimDeuxAns);

    }

}
