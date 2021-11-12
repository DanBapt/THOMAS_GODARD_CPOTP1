/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_thomas_godard;

/**
 *
 * @author danielthomas
 */
public class Personne {
    String nom, prenom;
    int nbVoitures = 0;
    Voiture [] liste_voitures;

    public Personne(String unNom, String unPrenom){
        nom = unNom;
        prenom = unPrenom;
        liste_voitures = new Voiture [3];
    }
    
    @Override
    public String toString(){
        String chaine_a_retourner;
        chaine_a_retourner = nom + " " + prenom;
        return chaine_a_retourner;
    }
}
    
    
