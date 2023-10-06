public class Location {
    private int nbUnitesLouees; //Nombre de matériels du même type loués
    private String nomClient;
    private int jourLocation_dcln;

    public Location(String pNomClient, int pNbUnitesLouees, int pJourLocation_dcln) {
        nomClient = pNomClient;
        nbUnitesLouees = pNbUnitesLouees;
        jourLocation_dcln = pJourLocation_dcln;
    }

    public int getNbUnitesLouees() {
        return this.nbUnitesLouees;
    }

    public String description() {
        return String.format("%s a loué %d unité(s) pour %d jour(s)", nomClient, getNbUnitesLouees(), getJourLocation_dcln());
    }

    public int getJourLocation_dcln() {
        return this.jourLocation_dcln;
    }
}
