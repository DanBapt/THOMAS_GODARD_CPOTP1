/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp4_console_godard_thomas;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author danielthomas
 */


public class Partie {
    Joueur ListeJoueurs[] = new  Joueur [2];
    Joueur joueurCourant;
   Grille grilleJeu =new Grille();
    
 public Partie(Joueur unJoueur){//créer constructeur partie crzer 2 joueurs 
 ListeJoueurs[0]= unJoueur;

}
    
public void attribuerCouleursAuxJoueurs(){ //comment utiliser dans le main 
//+ attribuerCouleursAuxJoueurs(): attribue des couleurs aux joueurs
//génère uun nombre aléatoire entre 0 et 1 
Random generateurAleat = new Random();
int n = generateurAleat.nextInt(2);
if (n==1){
    ListeJoueurs[0].Couleur="Rouge";
    ListeJoueurs[1].Couleur="Jaune";
}
else{
    ListeJoueurs[1].Couleur="Rouge";
    ListeJoueurs[0].Couleur="Jaune";
}
}

public void initialiserPartie(){
// + initialiserPartie() : crée la grille, crée les jetons et les attribue aux joueurs
//correspondants. Place les trous noirs (version 2) et les téléporteurs (version 3).   
Jeton j = new Jeton(ListeJoueurs[0].Couleur);
for(int i=0 ; i<21 ;i++){
    ListeJoueurs[0].ajouterJeton(j);
}
    Jeton k= new Jeton (ListeJoueurs[1].Couleur);
for(int i=0 ; i<21 ;i++){
    ListeJoueurs[1].ajouterJeton(k);
}

}
public void debuterPartie(){
//  debuterPartie(): lance la partie

}

}
        