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
private final boolean [][] Grille; 

   public Grille(int taille){ // constructeur grille 
              Grille= new boolean[taille][taille];
         for (int i=0;i<taille;i++){
            for (int j=0;j<taille;j++){  
                Grille[i][j] = false;
            }
         }
    }
      
    public String toString(){ // methode affichage grille 
        String s="";
    for (int i=0; i<Grille.length;i++){
            for (int j=0; j<Grille.length;j++){
                if (Grille[i][j]){
                    s+="V "; // allumé 
                }
                else {
                    s+="F "; // éteint
                }  
            }
             s+="\n";
    }
   
    return s; 
}

    public void clic(int x, int y){   // méthode changement lumières
        
        if ( Grille[x][y]==false){ 
             Grille[x][y]=true;
           
             
            if(x==0 && y!=0 && y!=Grille.length-1){ // pour le bord gauche 
                if(Grille[x+1][y]==false){
                   Grille[x+1][y]=true;
                }
                else{
                 Grille[x+1][y]=false;
                }
                if(Grille[x][y+1]==true){
                     Grille[x][y+1]=false;
                }
                else{
                     Grille[x][y+1]=true;
                } 
                if(Grille[x][y-1]==false){
                   Grille[x][y-1]=true;
                }
                else{
                 Grille[x][y-1]=false;
                }
            }
            if(y==0 && x!=0 && x!=Grille.length-1){  //pour le bord du haut 
                if(Grille[x+1][y]==false){
                Grille[x+1][y]=true;
                }
                else{
                Grille[x+1][y]=false;
                }
                if(Grille[x][y+1]==true){
                 Grille[x][y+1]=false;
                }
                else{
                 Grille[x][y+1]=true;
                }
                if(Grille[x-1][y]==true){
                 Grille[x-1][y]=false;
                }
                else{
                 Grille[x-1][y]=true;
                }
            }
            if(y==Grille.length-1 && x!=0 && x!=Grille.length-1){ // bord bas 
                if(Grille[x+1][y]==true){
                 Grille[x+1][y]=false;
                }
                else{
                 Grille[x+1][y]=true;
                }
                if(Grille[x-1][y]==true){
                 Grille[x-1][y]=false;
                }
                else{
                 Grille[x-1][y]=true;
                }
                if(Grille[x][y-1]==true){
                 Grille[x][y-1]=false;
                }
                else{
                 Grille[x][y-1]=true;
                }

            }
            if(x==Grille.length-1 && y!=0 && y!=Grille.length-1){// bord de droite 
                if(Grille[x][y+1]==true){
                 Grille[x][y+1]=false;
                }
                else{
                 Grille[x][y+1]=true;
                }
                if(Grille[x-1][y]==true){
                 Grille[x-1][y]=false;
                }
                else{
                 Grille[x-1][y]=true;
                }
                if(Grille[x][y-1]==true){
                 Grille[x][y-1]=false;
                }
                else{
                 Grille[x][y-1]=true;
                }
            }
            if(x==0 && y==0){ // coin haut gauche 
                if(Grille[1][0]==false){
                Grille[1][0]=true;
                }
                else{
                Grille[1][0]=false;
                }
                if(Grille[0][1]==true){
                 Grille[0][1]=false;
                }
                else{
                 Grille[0][1]=true;
                }
            }
            if(x==0 && y==4){ // coin bas gauche 
                if(Grille[0][3]==true){
                 Grille[0][3]=false;
                }
                else{
                 Grille[0][3]=true;
                }
                if(Grille[1][4]==true){
                 Grille[1][4]=false;
                }
                else{
                 Grille[1][4]=true;
                }
            }
            if(x==Grille.length-1 && y==0){ // coin haut droite 
                if(Grille[x][y+1]==true){
                 Grille[x][y+1]=false;
                }
                else{
                 Grille[x][y+1]=true;
                }
                if(Grille[x-1][y]==true){
                 Grille[x-1][y]=false;
                }
                else{
                 Grille[x-1][y]=true;
                }
            }
            if(x==Grille.length-1 && y==Grille.length-1){ // coin bas droite 
                
                if(Grille[x-1][y]==true){
                 Grille[x-1][y]=false;
                }
                else{
                 Grille[x-1][y]=true;
                }
                if(Grille[x][y-1]==true){
                 Grille[x][y-1]=false;
                }
                else{
                 Grille[x][y-1]=true;
                }
            }
            
        
            
        if(x!=0 && x!=Grille.length-1 && y!=0 && y!=Grille.length-1){ //centre 
                if(Grille[x+1][y]==false){
                Grille[x+1][y]=true;
                }
                else{
                Grille[x+1][y]=false;
                }
                if(Grille[x][y+1]==true){
                 Grille[x][y+1]=false;
                }
                else{
                 Grille[x][y+1]=true;
                }
                if(Grille[x-1][y]==true){
                 Grille[x-1][y]=false;
                }
                else{
                 Grille[x-1][y]=true;
                }
                if(Grille[x][y-1]==true){
                 Grille[x][y-1]=false;
                }
                else{
                 Grille[x][y-1]=true;
                }
        }
        }
        else{
             Grille[x][y]=false;
             if(x==0 && y!=0 && y!=Grille.length-1){ // pour le bord gauche 
                if(Grille[x+1][y]==false){
                   Grille[x+1][y]=true;
                }
                else{
                 Grille[x+1][y]=false;
                }
                if(Grille[x][y+1]==true){
                     Grille[x][y+1]=false;
                }
                else{
                     Grille[x][y+1]=true;
                } 
                if(Grille[x][y-1]==false){
                   Grille[x][y-1]=true;
                }
                else{
                 Grille[x][y-1]=false;
                }
            }
            if(y==0 && x!=0 && x!=Grille.length-1){  //pour le bord du haut 
                if(Grille[x+1][y]==false){
                Grille[x+1][y]=true;
                }
                else{
                Grille[x+1][y]=false;
                }
                if(Grille[x][y+1]==true){
                 Grille[x][y+1]=false;
                }
                else{
                 Grille[x][y+1]=true;
                }
                if(Grille[x-1][y]==true){
                 Grille[x-1][y]=false;
                }
                else{
                 Grille[x-1][y]=true;
                }
            }
            if(y==Grille.length-1 && x!=0 && x!=Grille.length-1){ // bord bas 
                if(Grille[x+1][y]==true){
                 Grille[x+1][y]=false;
                }
                else{
                 Grille[x+1][y]=true;
                }
                if(Grille[x-1][y]==true){
                 Grille[x-1][y]=false;
                }
                else{
                 Grille[x-1][y]=true;
                }
                if(Grille[x][y-1]==true){
                 Grille[x][y-1]=false;
                }
                else{
                 Grille[x][y-1]=true;
                }

            }
            if(x==Grille.length-1 && y!=0 && y!=Grille.length-1){// bord de droite 
                if(Grille[x][y+1]==true){
                 Grille[x][y+1]=false;
                }
                else{
                 Grille[x][y+1]=true;
                }
                if(Grille[x-1][y]==true){
                 Grille[x-1][y]=false;
                }
                else{
                 Grille[x-1][y]=true;
                }
                if(Grille[x][y-1]==true){
                 Grille[x][y-1]=false;
                }
                else{
                 Grille[x][y-1]=true;
                }
            }
            if(x==0 && y==0){ // coin haut gauche 
                if(Grille[1][0]==false){
                Grille[1][0]=true;
                }
                else{
                Grille[1][0]=false;
                }
                if(Grille[0][1]==true){
                 Grille[0][1]=false;
                }
                else{
                 Grille[0][1]=true;
                }
            }
            if(x==0 && y==4){ // coin bas gauche 
                if(Grille[0][3]==true){
                 Grille[0][3]=false;
                }
                else{
                 Grille[0][3]=true;
                }
                if(Grille[1][4]==true){
                 Grille[1][4]=false;
                }
                else{
                 Grille[1][4]=true;
                }
            }
            if(x==Grille.length-1 && y==0){ // coin haut droite 
                if(Grille[x][y+1]==true){
                 Grille[x][y+1]=false;
                }
                else{
                 Grille[x][y+1]=true;
                }
                if(Grille[x-1][y]==true){
                 Grille[x-1][y]=false;
                }
                else{
                 Grille[x-1][y]=true;
                }
            }
            if(x==Grille.length-1 && y==Grille.length-1){ // coin bas droite 
                
                if(Grille[x-1][y]==true){
                 Grille[x-1][y]=false;
                }
                else{
                 Grille[x-1][y]=true;
                }
                if(Grille[x][y-1]==true){
                 Grille[x][y-1]=false;
                }
                else{
                 Grille[x][y-1]=true;
                }
            }
            
        
            
        if(x!=0 && x!=Grille.length-1 && y!=0 && y!=Grille.length-1){ //centre 
                if(Grille[x+1][y]==false){
                Grille[x+1][y]=true;
                }
                else{
                Grille[x+1][y]=false;
                }
                if(Grille[x][y+1]==true){
                 Grille[x][y+1]=false;
                }
                else{
                 Grille[x][y+1]=true;
                }
                if(Grille[x-1][y]==true){
                 Grille[x-1][y]=false;
                }
                else{
                 Grille[x-1][y]=true;
                }
                if(Grille[x][y-1]==true){
                 Grille[x][y-1]=false;
                }
                else{
                 Grille[x][y-1]=true;
                }
        }
        }
      
        }
        
        
        
      
    public void aleat(){ // methode qui remplie la grille de booleans aléatoires 
        String s="";
        for (int i=0; i<Grille.length;i++){
            for (int j=0; j<Grille.length;j++){
             Random r = new Random();
             int x= r.nextInt(2);
             if(x==0){
                Grille[i][j]= true;
            }
            }
      
            }
    }
    
    public boolean finpartie(){ // méthode qui vérifie si la partie est terminée 
       
        for (int i=0; i<Grille.length;i++){
            for (int j=0; j<Grille.length;j++){
                if(Grille[i][j]){
                    return false; 
                }
            }
            
    }
        return true;
}
  
   
}
        
