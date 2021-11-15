/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


//Attributs :
//• Couleur : couleur affectée au joueur Méthodes :
//• Jeton (String) : constructeur initialisant la couleur du jeton avec le paramètre
//• lireCouleur():renvoie la couleur du jeton

package sp4_console_godard_thomas;

/**
 *
 * @author danielthomas
 */
public class Jeton {
    String Couleur;
    
    public Jeton (String uneCouleur){
        Couleur= uneCouleur;
    }
    public String lireCouleur(){
//      renvoie la couleur du jeton
    return Couleur;
    }
} 
        