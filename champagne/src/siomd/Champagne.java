/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package siomd;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author SIO2
 */
public class Champagne {
    
    static private Coop laCooperative;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // créez deux communes  
        Commune reims = new Commune(51454, "Reims", 0.85);
        Commune epernay = new Commune(51230, "Epernay", 0.73);
        
        // créez  un dictionnaire de communes
        Map<Integer, Commune> desCommunes = new HashMap<Integer, Commune>();
        
        // ajoutez les communes au dictionnaire de communes              
        desCommunes.put(reims.getNumCommune(), reims);
        desCommunes.put(epernay.getNumCommune(), epernay);
        
        // créez deux coopérateurs avec quelques parcelles chacun
        Cooperateur grouillan = new Cooperateur(1, "Grouillan");
        Cooperateur dupont = new Cooperateur(2, "Dupont");
        
        dupont.ajouterParcelle(new Parcelle(13, 75, 1753, reims));
        dupont.ajouterParcelle(new Parcelle(14, 56, 2332, reims));
        dupont.ajouterParcelle(new Parcelle(138, 25, 2739, epernay));
        
        grouillan.ajouterParcelle(new Parcelle(3, 80, 1418, epernay));
        grouillan.ajouterParcelle(new Parcelle(4,110, 3456, epernay));
        grouillan.ajouterParcelle(new ParcelleExperimentale(24, 30, 3945, reims, 1, LocalDate.of(2016, 06, 12), 14, "Rince-vie"));
        grouillan.ajouterParcelle(new Parcelle(24, 30, 3945, reims));
        grouillan.ajouterParcelle(new ParcelleExperimentale(75, 20, 210, reims, 2, LocalDate.of(2015, 09, 23), 14, "Rince-v"
        + " in"));
        
        // créez  un dictionnaire de coopérateurs
        Map<String, Cooperateur> desCooperateurs = new HashMap<String, Cooperateur>();
        
        // ajoutez les coopérateurs au dictionnaire de coopérateurs
        desCooperateurs.put(grouillan.getNomCooperateur(), grouillan);
        desCooperateurs.put(dupont.getNomCooperateur(), dupont);
        
        // créez la coopérative
        Coop coop = new Coop(desCommunes, desCooperateurs);
        
        // afficher la liste
         
    }

    // afficher les parcelles des coopérateurs de la coopérative
    public static void afficherListe() {
        // déclarer et initialiser les totaux 
        int nbParcelles = 0, totHectares = 0, totProduction = 0, nbParcellesExp = 0;
        double totSomme = 0;
        
        // afficher les titres

        // afficher les parcelles
        // parcourir les coopérateurs puis les parcelles du coopérateur
        Iterator iterCooperateurs = laCooperative.getIterCooperateurs();
 
        while (iterCooperateurs.hasNext()) {
   
        }

        // afficher les totaux
    }

    }
    
}
