import java.util.Scanner;

public class App {
    private static TypeMateriel monTypeMateriel;
    private static Scanner scanner = new Scanner(System.in);

    public static String saisirChaine(String nomChaine) {
        
        String unNom;
        do {
            System.out.print("Entrez : " + nomChaine);
            unNom = scanner.nextLine();
        } while (unNom.isEmpty());
        return unNom;
    }

    public static int saisirNombreEntier(String nomNombre) {
        int nombre = 0;
        do {
            System.out.println("Entrez : " + nomNombre);
            try {
                nombre = Integer.parseInt(scanner.nextLine());
            }
            catch(Exception ex) {
                nombre = 0;
            }
            if (nombre < 1) {
                System.out.println("Veuillez saisir un nombre : ");
            }
        } while (nombre < 1);
        return nombre;
    }

    public static void afficher() {
        System.out.println(monTypeMateriel.getDescription() + " pour un total de " + monTypeMateriel.getNbMatLoues()*monTypeMateriel.getPrixJourLocation_dcln() + " euros");
        for (int i = 0; i < monTypeMateriel.getNbLocations(); i++) {
            System.out.println(monTypeMateriel.getLocation(i).description() + " pour un total de " + monTypeMateriel.getLocation(i).getNbUnitesLouees()*monTypeMateriel.getPrixJourLocation_dcln()*monTypeMateriel.getLocation(i).getJourLocation_dcln() + " euros");
        }
        System.out.println("La location avec le plus d'unités est : " + monTypeMateriel.locationMax_dcln().description());
    }

    public static void louerMateriel() {
        int leNombre = saisirNombreEntier("\nNombre d'unités : ");
        if (monTypeMateriel.isLocationPossible(leNombre)) {
            monTypeMateriel.louer(saisirChaine("Nom du client ? "), leNombre, saisirNombreEntier("Nombre de jour de location : "));
            System.out.println("Location bien enregistrée ! ");
        } else {
            System.out.println("Le nombre de matériels disponibles est insuffisant ! ");
        }
    }

    public static void traiterMenu() {
        int choix;
        do {
            System.out.println("\n1 - Louer un matériel");
            System.out.println("2 - Afficher le matériel et les locations");
            System.out.println("3 - Quitter l'application");
            System.out.print("\nVotre choix : ");
            choix = scanner.nextInt();
            switch (choix) {
                case 1:
                    louerMateriel();
                    break;
                case 2:
                    afficher();
                    break;
                case 3:
                    System.out.println("Au revoir !");
                    break;
                default:
                    System.out.println("Choix invalide, veuillez réessayer.");
            }
        } while (choix != 3);
    }

    public static void main(String[] args) {
        String reference = saisirChaine("Référence matériel ? ");
        int nombre = saisirNombreEntier("Nombre de matériels à louer ? ");
        int prix_dcln = saisirNombreEntier("Prix de location à l'unité pour une journée ? ");
        monTypeMateriel = new TypeMateriel(reference, nombre, prix_dcln);
        traiterMenu();
    }
}