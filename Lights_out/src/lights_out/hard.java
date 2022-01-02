/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lights_out;

/**
 *
 * @author danielthomas
 */
public class hard {
    private final boolean [][] hard; 

    public hard(int taille){
          hard= new boolean[5][5];
         for (int i=0;i<5;i++){
            for (int j=0;j<5;j++){
                hard[i][j] = false;
            }
         }
    hard[0][0]=true;
    hard[0][1]=true;
    hard[0][3]=true;
    hard[0][4]=true;
    hard[1][2]=true;
    hard[2][0]=true;
    hard[2][1]=true;
    hard[3][1]=true;
    hard[3][4]=true;
    

    }
   public void clic2(int x, int y){   
        
        if ( hard[x][y]==false){
             hard[x][y]=true;
             // 4 coins + Bords bas et droite 
             
            if(x==0 && y!=0 && y!=hard.length-1){ // pour le bord gauche   
                if(hard[x+1][y]==false){
                   hard[x+1][y]=true;
                }
                else{
                 hard[x+1][y]=false;
                }
                if(hard[x][y+1]==true){
                     hard[x][y+1]=false;
                }
                else{
                     hard[x][y+1]=true;
                } 
                if(hard[x][y-1]==false){
                   hard[x][y-1]=true;
                }
                else{
                 hard[x][y-1]=false;
                }
            }
            if(y==0 && x!=0 && x!=hard.length-1){  //pour le bord du haut   
                if(hard[x+1][y]==false){
                hard[x+1][y]=true;
                }
                else{
                hard[x+1][y]=false;
                }
                if(hard[x][y+1]==true){
                 hard[x][y+1]=false;
                }
                else{
                 hard[x][y+1]=true;
                }
                if(hard[x-1][y]==true){
                 hard[x-1][y]=false;
                }
                else{
                 hard[x-1][y]=true;
                }
            }
            if(y==hard.length-1 && x!=0 && x!=hard.length-1){ // bord bas   
                if(hard[x+1][y]==true){
                 hard[x+1][y]=false;
                }
                else{
                 hard[x+1][y]=true;
                }
                if(hard[x-1][y]==true){
                 hard[x-1][y]=false;
                }
                else{
                 hard[x-1][y]=true;
                }
                if(hard[x][y-1]==true){
                 hard[x][y-1]=false;
                }
                else{
                 hard[x][y-1]=true;
                }

            }
            if(x==hard.length-1 && y!=0 && y!=hard.length-1){// bord de droite   
                if(hard[x][y+1]==true){
                 hard[x][y+1]=false;
                }
                else{
                 hard[x][y+1]=true;
                }
                if(hard[x-1][y]==true){
                 hard[x-1][y]=false;
                }
                else{
                 hard[x-1][y]=true;
                }
                if(hard[x][y-1]==true){
                 hard[x][y-1]=false;
                }
                else{
                 hard[x][y-1]=true;
                }
            }
            if(x==0 && y==0){ // coin haut gauche      

                if(hard[1][0]==false){
                hard[1][0]=true;
                }
                else{
                hard[1][0]=false;
                }
                if(hard[0][1]==true){
                 hard[0][1]=false;
                }
                else{
                 hard[0][1]=true;
                }
            }
            if(x==0 && y==4){ // coin bas gauche   
                if(hard[0][3]==true){
                 hard[0][3]=false;
                }
                else{
                 hard[0][3]=true;
                }
                if(hard[1][4]==true){
                 hard[1][4]=false;
                }
                else{
                 hard[1][4]=true;
                }
            }
            if(x==hard.length-1 && y==0){ // coin haut droite   
                if(hard[x][y+1]==true){
                 hard[x][y+1]=false;
                }
                else{
                 hard[x][y+1]=true;
                }
                if(hard[x-1][y]==true){
                 hard[x-1][y]=false;
                }
                else{
                 hard[x-1][y]=true;
                }
            }
            if(x==hard.length-1 && y==hard.length-1){ // coin bas droite   
                
                if(hard[x-1][y]==true){
                 hard[x-1][y]=false;
                }
                else{
                 hard[x-1][y]=true;
                }
                if(hard[x][y-1]==true){
                 hard[x][y-1]=false;
                }
                else{
                 hard[x][y-1]=true;
                }
            }
            
        
            
        if(x!=0 && x!=hard.length-1 && y!=0 && y!=hard.length-1){ //centre 
                if(hard[x+1][y]==false){
                hard[x+1][y]=true;
                }
                else{
                hard[x+1][y]=false;
                }
                if(hard[x][y+1]==true){
                 hard[x][y+1]=false;
                }
                else{
                 hard[x][y+1]=true;
                }
                if(hard[x-1][y]==true){
                 hard[x-1][y]=false;
                }
                else{
                 hard[x-1][y]=true;
                }
                if(hard[x][y-1]==true){
                 hard[x][y-1]=false;
                }
                else{
                 hard[x][y-1]=true;
                }
        }
        }
        else{
             hard[x][y]=false;
             if(x==0 && y!=0 && y!=hard.length-1){ // pour le bord gauche   
                if(hard[x+1][y]==false){
                   hard[x+1][y]=true;
                }
                else{
                 hard[x+1][y]=false;
                }
                if(hard[x][y+1]==true){
                     hard[x][y+1]=false;
                }
                else{
                     hard[x][y+1]=true;
                } 
                if(hard[x][y-1]==false){
                   hard[x][y-1]=true;
                }
                else{
                 hard[x][y-1]=false;
                }
            }
            if(y==0 && x!=0 && x!=hard.length-1){  //pour le bord du haut   
                if(hard[x+1][y]==false){
                hard[x+1][y]=true;
                }
                else{
                hard[x+1][y]=false;
                }
                if(hard[x][y+1]==true){
                 hard[x][y+1]=false;
                }
                else{
                 hard[x][y+1]=true;
                }
                if(hard[x-1][y]==true){
                 hard[x-1][y]=false;
                }
                else{
                 hard[x-1][y]=true;
                }
            }
            if(y==hard.length-1 && x!=0 && x!=hard.length-1){ // bord bas   
                if(hard[x+1][y]==true){
                 hard[x+1][y]=false;
                }
                else{
                 hard[x+1][y]=true;
                }
                if(hard[x-1][y]==true){
                 hard[x-1][y]=false;
                }
                else{
                 hard[x-1][y]=true;
                }
                if(hard[x][y-1]==true){
                 hard[x][y-1]=false;
                }
                else{
                 hard[x][y-1]=true;
                }

            }
            if(x==hard.length-1 && y!=0 && y!=hard.length-1){// bord de droite   
                if(hard[x][y+1]==true){
                 hard[x][y+1]=false;
                }
                else{
                 hard[x][y+1]=true;
                }
                if(hard[x-1][y]==true){
                 hard[x-1][y]=false;
                }
                else{
                 hard[x-1][y]=true;
                }
                if(hard[x][y-1]==true){
                 hard[x][y-1]=false;
                }
                else{
                 hard[x][y-1]=true;
                }
            }
            if(x==0 && y==0){ // coin haut gauche      

                if(hard[1][0]==false){
                hard[1][0]=true;
                }
                else{
                hard[1][0]=false;
                }
                if(hard[0][1]==true){
                 hard[0][1]=false;
                }
                else{
                 hard[0][1]=true;
                }
            }
            if(x==0 && y==4){ // coin bas gauche   
                if(hard[0][3]==true){
                 hard[0][3]=false;
                }
                else{
                 hard[0][3]=true;
                }
                if(hard[1][4]==true){
                 hard[1][4]=false;
                }
                else{
                 hard[1][4]=true;
                }
            }
            if(x==hard.length-1 && y==0){ // coin haut droite   
                if(hard[x][y+1]==true){
                 hard[x][y+1]=false;
                }
                else{
                 hard[x][y+1]=true;
                }
                if(hard[x-1][y]==true){
                 hard[x-1][y]=false;
                }
                else{
                 hard[x-1][y]=true;
                }
            }
            if(x==hard.length-1 && y==hard.length-1){ // coin bas droite   
                
                if(hard[x-1][y]==true){
                 hard[x-1][y]=false;
                }
                else{
                 hard[x-1][y]=true;
                }
                if(hard[x][y-1]==true){
                 hard[x][y-1]=false;
                }
                else{
                 hard[x][y-1]=true;
                }
            }
            
        
            
        if(x!=0 && x!=hard.length-1 && y!=0 && y!=hard.length-1){ //centre 
                if(hard[x+1][y]==false){
                hard[x+1][y]=true;
                }
                else{
                hard[x+1][y]=false;
                }
                if(hard[x][y+1]==true){
                 hard[x][y+1]=false;
                }
                else{
                 hard[x][y+1]=true;
                }
                if(hard[x-1][y]==true){
                 hard[x-1][y]=false;
                }
                else{
                 hard[x-1][y]=true;
                }
                if(hard[x][y-1]==true){
                 hard[x][y-1]=false;
                }
                else{
                 hard[x][y-1]=true;
                }
        }
        }
        
        }
     
          public String toString(){
        String s="";
    for (int i=0; i<hard.length;i++){
            for (int j=0; j<hard.length;j++){
                if (hard[i][j]){
                    s+="V ";
                }
                else {
                    s+="F ";
                }  
            }
             s+="\n";
    }
   
    return s; 
   
}
           public boolean finpartie2(){ //    
        for (int i=0; i<hard.length;i++){
            for (int j=0; j<hard.length;j++){
                if(hard[i][j]){
                    return false; 
                }
            }
            
    }
        return true;
}
}
