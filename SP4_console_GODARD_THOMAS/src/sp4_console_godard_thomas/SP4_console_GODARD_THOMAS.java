/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sp4_console_godard_thomas;

import java.util.Scanner;

/**
 *
 * @author danielthomas
 */
public class SP4_console_GODARD_THOMAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//QST
//partie attribuer couleur 

//        création des deux joueurs 
    
String nomJ1;
String nomJ2;
Scanner sc = new Scanner(System.in);
        System.out.println("Entrer le nom du premier Joueur: ");
        nomJ1=sc.nextLine(); 
        Joueur J1= new Joueur(nomJ1);
        System.out.println("Entrer le nom du deuxième Joueur: ");
        nomJ2=sc.nextLine(); 
        Joueur J2= new Joueur(nomJ2);
       
        // test couleur 
        Jeton j = new Jeton("Rouge");
        String c= j.lireCouleur();
        System.out.println("couleur : "+ c);
        
//        J1.attribuerCouleursAuxJoueurs();
//        System.out.println(J1.Couleur);
//        



Partie p=new Partie(J1);
System.out.println(J1.Couleur);

    }
    
}
