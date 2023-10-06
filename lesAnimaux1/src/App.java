import java.time.LocalDate;

public class App {
    public static void main(String[] args) throws Exception {
        // créer 3 chats 
        Chat Felix = new Chat("Félix", "persan", LocalDate.of(2012,11,15)); // new est un opérateur 
        Chat Sylvestre = new Chat("Sylvestre", "gouttière", LocalDate.of(2022,03,22));
        Chat Isidore = new Chat("Isidore", "siamois", LocalDate.of(2019,06,02));

        // afficher les chats
        System.out.println(Felix.decrire());
        System.out.println(Sylvestre.decrire());
        System.out.println(Isidore.decrire());

        // type valeur
        int nb;
        nb = 15;
        System.out.printf("\nentier (type valeur) : nb = %d", nb);
        int nbDeux = nb;

        // référence d'objet, type référence
        Chat picasso;
        picasso = new Chat("Picasso", "persan", LocalDate.of(2012, 6, 15));
        System.out.printf("\nobjet crée avec new : picasso = %s", picasso);
        Chat theodore = picasso;

        // ********* particularités classe String
        System.out.println("\n\n\n STRING\n");
        String salut = "salut";
        String salut2 = "salut";
        String salut3 = new String("salut");
        System.out.printf("\nsalut = %s salut2 = %s salut3 = %s\n\n", salut, salut2, salut3); 
        System.out.printf("\nsalut != salut2 = %s", salut != salut2); // false
        System.out.printf("\nsalut == salut2 = %s", salut == salut2); // true
        System.out.printf("\nsalut.equals(salut2) = %s", salut.equals(salut2)); // true     equals conpare les contenus 
        System.out.printf("\nsalut3 != salut2 = %s", salut3 != salut2); // true
        System.out.printf("\nsalut3 == salut2 = %s", salut3 == salut2); // false            == compare les refs
        System.out.printf("\nsalut.equals(salut3) = %s", salut.equals(salut3)); // true
        System.out.printf("\nid salut = %d", System.identityHashCode(salut)); // identité objet
        System.out.printf("\nid salut2 = %d",System.identityHashCode(salut2));
        System.out.printf("\nid salut3 = %d",System.identityHashCode(salut3));
        salut2 = "bonjour";
        System.out.printf("\n**********\nsalut = %s salut2 = %s", salut, salut2);
        System.out.printf("\nsalut != salut2 = %s", salut != salut2); // true
        System.out.printf("\nsalut == salut2 = %s", salut == salut2); // false
        System.out.printf("\nsalut.equals(salut2) = %s", salut.equals(salut2)); // false
        System.out.printf("\nid salut = %d", System.identityHashCode(salut));
        System.out.printf("\nid salut2 = %d",System.identityHashCode(salut2));
        System.out.printf("\nid salut3 = %d",System.identityHashCode(salut3));
        // == compare les références d'objets
        // equals compare les valeurs des objets. La méthode equals() permet de tester l'égalité de deux objets d'un point de vue sémantique.

        // utilisation du constructeur surchargé
        Chat Tigrou = new Chat("Tigrou", "Gouttiére", LocalDate.of(2011, 8, 23), "Miiiou");
        System.out.println(Tigrou.decrire());

        // invoquer méthode surchargée
        System.out.printf("\nAppel Felix.miauler() : %s", Felix.miauler());
        System.out.printf("\nAppel Felix.miauler(5) : %s", Felix.miauler(5));
        System.out.printf("\nAppel Tigrou.miauler() : %s", Tigrou.miauler());
        System.out.printf("\nAppel Tigrou.miauler(5) : %s", Tigrou.miauler(5));

        // invoquer accesseur statique
        System.out.printf("\nAppel méthode Chat.getMiaulement : %s\n", Chat.getMiaulement());

        // 1. Dans le programme, déclarer un tableau de 3 chats et remplissez le tableau avec les 3 chats crées précédemment
        Chat[] tbChat = new Chat[3];
        tbChat[0] = Felix;
        tbChat[1] = Sylvestre;
        tbChat[2] = Isidore;

        // 2. Afficher la description de chaque chat en parcourant le tableau avec un for
        for (int i = 0; i < tbChat.length ; i++) {
            System.out.printf(tbChat[i].decrire());
        }

        // 3. Afficher le nombre de chats en utilisant le nombre d'éléments du tableau
        int nbChat = tbChat.length;
        if (nbChat == 0) {
            System.out.println("\nIl n\'y a pas de chat");
        } else if (nbChat == 1) {
            System.out.println("\nIl y a 1 chat");
        } else {
            System.out.printf("\nIl y a %d chats", nbChat);
        }

        // 4. Afficher la description de chaque chat en parcourant le tableau avec un foreach
        for (Chat chat : tbChat) {
            System.out.printf("\n",chat.decrire());
        }

        // 5. Parcourir le tableau pour calculer et afficher la moyenne d'âge des chats
        int avgAge = 0;
        for (Chat chat : tbChat) {
            avgAge += chat.getAge();
        }
        System.out.printf("\nLa moyenne d\'âge est de %f", avgAge/tbChat.length);

        // 6. Parcourir le tableau pour chercher le chat le plus jeune et afficher son nom et son âge.
        int chatPlusJeuneAge = tbChat[0].getAge();
        String chatPlusJeuneNom = tbChat[0].getNom();
        for (int iw = 1; iw < tbChat.length; iw++) {
            if (tbChat[iw].getAge() < chatPlusJeuneAge) {
                chatPlusJeuneAge = tbChat[iw].getAge();
                chatPlusJeuneNom = tbChat[iw].getNom();
            }
        }
        System.out.printf("%s est le plus jeune chat, il a %d ans", chatPlusJeuneNom, chatPlusJeuneAge);

    }
}
