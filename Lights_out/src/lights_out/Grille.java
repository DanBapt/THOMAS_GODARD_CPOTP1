/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lights_out;
import java.util.Random;

/**
 *
 * @author danielthomas
 */
class Grille {
   // int taille; 
//    Bouton [][] BoutonJeu=new Bouton[taille][taille];
private boolean [][] Grille; 

   public Grille(int taille){
              Grille= new boolean[taille][taille];
         for (int i=0;i<taille;i++){
            for (int j=0;j<taille;j++){
                Grille[i][j] = false;
            }
         }
    }
      
    public String toString(){
        String s="";
    for (int i=0; i<Grille.length;i++){
            for (int j=0; j<Grille.length;j++){
                if (Grille[i][j]){
                    s+=" on  ";
                }
                else {
                    s+=" off ";
                }  
            }
             s+="\n";
    }
   
    return s; 
}
    

    public void clic(int x, int y){
      
            
        if ( Grille[x][y]==false){
             Grille[x][y]=true;
             Grille[x+1][y]=true;
             Grille[x][y+1]=true;
             Grille[x-1][y]=true;
             Grille[x][y-1]=true;
        }
        else{
        Grille[x][y]=false;
        Grille[x+1][y]=false;
        Grille[x][y+1]=false;
        Grille[x-1][y]=false;
        Grille[x][y-1]=false;
        }
        }
      
    }
        
//          for (int i=0; i<Grille.length;i++){
//            for (int j=0; j<Grille.length;j++){
//                while(Grille[i][j]==false){
//                    System.out.print("c'est la win bg");
                
//                }
//   }
//}