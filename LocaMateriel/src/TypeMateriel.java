import java.util.ArrayList;
import java.util.List;

public class TypeMateriel {
    
    private List<Location> mesLocations;
    private int nombre; //Nombre de matériels de ce type à louer
    private String reference; //Chaine de caractères qui identifie un type de matériel. Exemple : tondeuse
    private int prixJourLocation_dcln;

    public TypeMateriel(String pReference, int pNombre, int pPrixJourLocation_ndcl) {
        reference = pReference;
        nombre = pNombre;
        mesLocations = new ArrayList<Location>();
        prixJourLocation_dcln = pPrixJourLocation_ndcl;
    }

    public int getNbMatLoues() {
        int nbLocation = 0;
        for (Location uneLocation : mesLocations) {
            nbLocation += uneLocation.getNbUnitesLouees();
        }
        return nbLocation;
    }

    public boolean isLocationPossible(int pNombre) {
        return (pNombre <= (nombre - getNbMatLoues()));
    }
    
    public void louer(String pNomClient, int pNombre, int pJourLocation_dcln) {
        mesLocations.add(new Location(pNomClient, pNombre, pJourLocation_dcln));
    }

    public String getDescription() {
        return String.format("%d %s dont %d loué(e.s) au prix de %d euros/unité/jour ", nombre, reference, getNbMatLoues(), getPrixJourLocation_dcln());
    }

    public int getNbLocations() {
        return mesLocations.size();
    }

    public Location getLocation(int pIndice) {
        return mesLocations.get(pIndice);
    }

    public int getPrixJourLocation_dcln() {
        return this.prixJourLocation_dcln;
    }

    // retourne la location qui loue le plus grand nombre d'unités
    public Location locationMax_dcln() {
        int indiceLocaMax_dcln = 0;
        for (int i = 1; i < mesLocations.size(); i++) {
            if (mesLocations.get(i).getNbUnitesLouees() > mesLocations.get(0).getNbUnitesLouees()) {
                indiceLocaMax_dcln = i;
            }
        }
        return mesLocations.get(indiceLocaMax_dcln);
    }
}
