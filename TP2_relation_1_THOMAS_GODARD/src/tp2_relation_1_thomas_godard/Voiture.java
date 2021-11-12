/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_thomas_godard;

/**
 *
 * @author danielthomas
 */
public class Voiture {
     String Modele, Marque;
    int PuissanceCV;
    Personne proprietaire;
    
    public Voiture(String unModele, String uneMarque, int unePuissanceCV){
        Modele = unModele;
        Marque = uneMarque;
        PuissanceCV = unePuissanceCV;
        proprietaire = null;
    }
    
    @Override
    public String toString() {
        String chaine_a_retourner;
        chaine_a_retourner = Modele+ " " + Marque + " " + PuissanceCV;
        return chaine_a_retourner;
    }
}
