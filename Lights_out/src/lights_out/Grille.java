/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lights_out;

/**
 *
 * @author danielthomas
 */
class Grille {
    int taille; 
    Bouton [][] BoutonJeu=new Bouton[taille][taille];

   public Grille(int taille){
         for (int i=0;i<taille;i++){
            for (int j=0;j<taille;j++){
                BoutonJeu[i][j]= new Bouton();
            }
         }
    }
   
}