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
//    
//String nomJ1;
//String nomJ2;
//Scanner sc = new Scanner(System.in);
//System.out.println("Entrer le nom du premier Joueur: ");
//nomJ1=sc.nextLine(); 
//Joueur J1= new Joueur(nomJ1);
//System.out.println("Entrer le nom du deuxième Joueur: ");
//nomJ2=sc.nextLine(); 
//Joueur J2= new Joueur(nomJ2);
Partie partie= new Partie();
//partie.ListeJoueurs[0]=J1;
//partie.ListeJoueurs[1]=J2;
//partie.initialiserPartie();`

partie.initialiserPartie();
partie.debuterPartie();

//test 
//Partie p= new Partie(J1,J2);
//p.attribuerCouleursAuxJoueurs();
//System.out.println("couleur J1 :"+J1.Couleur);
//System.out.println("couleur J2 :"+J2.Couleur);
//p.ListeJoueurs[0]=J1;
//p.ListeJoueurs[1]=J2;
//Jeton jetonJ1 = new Jeton(J1.Couleur);
//Jeton jetonJ2 = new Jeton(J2.Couleur);
//for (int i=0; i<21; i++) {
//            J1.ListeJetons[i]=jetonJ1;
//            J2.ListeJetons[i]=jetonJ2;
//                    
//    }
//        J1.ajouterJeton(jetonJ1);
//        J2.ajouterJeton(jetonJ2);
//        p.initialiserPartie();
//        p.debuterPartie();
        
//Grille g= new Grille(); 
//g.afficherGrilleSurConsole();

//Cellule c = new Cellule();

}
}