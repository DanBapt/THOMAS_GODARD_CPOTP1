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
   Grille grilleJeu;
   
  public Partie(Joueur joueur1, Joueur joueur2) {
        ListeJoueurs[0] = joueur1;
        ListeJoueurs[1] = joueur2;

}

public void attribuerCouleursAuxJoueurs(){ //comment utiliser dans le main 
//+ attribuerCouleursAuxJoueurs(): attribue des couleurs aux joueurs
//génère un nombre aléatoire entre 0 et 1 
Random generateurAleat = new Random();
int n = generateurAleat.nextInt(2);
if (n==1){
    ListeJoueurs[0].affecterCouleur("Rouge");
    ListeJoueurs[1].affecterCouleur("Jaune");
}
else{
    ListeJoueurs[1].affecterCouleur("Rouge");
    ListeJoueurs[0].affecterCouleur("Jaune");
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
        Random generateurAleat = new Random();
int premierh = generateurAleat.nextInt(2);
Joueur deuxieme;
String couleurh;
if (premierh==0 ){
    couleurh="Rouge";
}
else {
couleurh="Jaune";
            }
if (ListeJoueurs[0].Couleur==couleurh){
    joueurCourant = ListeJoueurs[0];
    deuxieme = ListeJoueurs[1];
}
else{
joueurCourant=ListeJoueurs[1];
deuxieme = ListeJoueurs[0];
}

}   
}