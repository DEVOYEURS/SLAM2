/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesanimaux3;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author delio
 */
public class Chat extends Animal{
      // champ statique (à portée classe et non instance)
    private static String miaulement = "Miaou";

    // accesseur statique  (à portée classe et non instance)
    public static String getMiaulement() {
        return Chat.miaulement; 
    }

    // champs, attributs
    private String cri;

    // constructeur surchargé = redéfini avec le même nom mais une liste de paramètres différente
    public Chat(String pNom, String pRace, LocalDate pDateNaissance) {
        super(pNom, pRace, pDateNaissance);
        // cri = "Miaou";
        cri = Chat.miaulement;
    }

    // constructeur surchargé = redéfini avec le même nom mais une liste de paramètres différente
    public Chat(String pNom, String pRace, LocalDate pDateNaissance, String pCri) {
        super(pNom, pRace, pDateNaissance);
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
        return String.format("%s chat de %d ans de race %s. Son cri est %s", nom, getAge(), getRace(), cri);
    }


}
