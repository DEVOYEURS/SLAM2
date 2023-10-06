/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package siomd;

/**
 *
 * @author SIO2
 */
public class Commune {
    private int numCommune;
    private String nomCommune;
    private double classement;

    /**
     * @return the numCommune
     */
    public int getNumCommune() {
        return numCommune;
    }

    /**
     * @return the nomCommune
     */
    public String getNomCommune() {
        return nomCommune;
    }

    /**
     * @return the classement
     */
    public double getClassement() {
        return classement;
    }
    
    public Commune(int pNumCommune, String pNomCommune, double pClassement) {
        numCommune = pNumCommune;
        nomCommune = pNomCommune;
        classement = pClassement;
    }
}
