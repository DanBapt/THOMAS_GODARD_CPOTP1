/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lights_out;

/**
 *
 * @author danielthomas
 */
public class initiation {
    private final boolean [][] initiation; 

    public initiation(int taille){
          initiation= new boolean[5][5];
         for (int i=0;i<5;i++){
            for (int j=0;j<5;j++){
                initiation[i][j] = false;
            }
         }
    initiation[2][2]=true;
    initiation[3][2]=true;
    initiation[2][3]=true;
    initiation[1][2]=true;
    initiation[2][1]=true;

    }
   public void clic2(int x, int y){   
        
        if ( initiation[x][y]==false){
             initiation[x][y]=true;
             // 4 coins + Bords bas et droite 
             
            if(x==0 && y!=0 && y!=initiation.length-1){ // pour le bord gauche  
                if(initiation[x+1][y]==false){
                   initiation[x+1][y]=true;
                }
                else{
                 initiation[x+1][y]=false;
                }
                if(initiation[x][y+1]==true){
                     initiation[x][y+1]=false;
                }
                else{
                     initiation[x][y+1]=true;
                } 
                if(initiation[x][y-1]==false){
                   initiation[x][y-1]=true;
                }
                else{
                 initiation[x][y-1]=false;
                }
            }
            if(y==0 && x!=0 && x!=initiation.length-1){  //pour le bord du haut  
                if(initiation[x+1][y]==false){
                initiation[x+1][y]=true;
                }
                else{
                initiation[x+1][y]=false;
                }
                if(initiation[x][y+1]==true){
                 initiation[x][y+1]=false;
                }
                else{
                 initiation[x][y+1]=true;
                }
                if(initiation[x-1][y]==true){
                 initiation[x-1][y]=false;
                }
                else{
                 initiation[x-1][y]=true;
                }
            }
            if(y==initiation.length-1 && x!=0 && x!=initiation.length-1){ // bord bas  
                if(initiation[x+1][y]==true){
                 initiation[x+1][y]=false;
                }
                else{
                 initiation[x+1][y]=true;
                }
                if(initiation[x-1][y]==true){
                 initiation[x-1][y]=false;
                }
                else{
                 initiation[x-1][y]=true;
                }
                if(initiation[x][y-1]==true){
                 initiation[x][y-1]=false;
                }
                else{
                 initiation[x][y-1]=true;
                }

            }
            if(x==initiation.length-1 && y!=0 && y!=initiation.length-1){// bord de droite  
                if(initiation[x][y+1]==true){
                 initiation[x][y+1]=false;
                }
                else{
                 initiation[x][y+1]=true;
                }
                if(initiation[x-1][y]==true){
                 initiation[x-1][y]=false;
                }
                else{
                 initiation[x-1][y]=true;
                }
                if(initiation[x][y-1]==true){
                 initiation[x][y-1]=false;
                }
                else{
                 initiation[x][y-1]=true;
                }
            }
            if(x==0 && y==0){ // coin haut gauche
                if(initiation[1][0]==false){
                initiation[1][0]=true;
                }
                else{
                initiation[1][0]=false;
                }
                if(initiation[0][1]==true){
                 initiation[0][1]=false;
                }
                else{
                 initiation[0][1]=true;
                }
            }
            if(x==0 && y==4){ // coin bas gauche  
                if(initiation[0][3]==true){
                 initiation[0][3]=false;
                }
                else{
                 initiation[0][3]=true;
                }
                if(initiation[1][4]==true){
                 initiation[1][4]=false;
                }
                else{
                 initiation[1][4]=true;
                }
            }
            if(x==initiation.length-1 && y==0){ // coin haut droite  
                if(initiation[x][y+1]==true){
                 initiation[x][y+1]=false;
                }
                else{
                 initiation[x][y+1]=true;
                }
                if(initiation[x-1][y]==true){
                 initiation[x-1][y]=false;
                }
                else{
                 initiation[x-1][y]=true;
                }
            }
            if(x==initiation.length-1 && y==initiation.length-1){ // coin bas droite  
                
                if(initiation[x-1][y]==true){
                 initiation[x-1][y]=false;
                }
                else{
                 initiation[x-1][y]=true;
                }
                if(initiation[x][y-1]==true){
                 initiation[x][y-1]=false;
                }
                else{
                 initiation[x][y-1]=true;
                }
            }
            
        
            
        if(x!=0 && x!=initiation.length-1 && y!=0 && y!=initiation.length-1){ //centre 
                if(initiation[x+1][y]==false){
                initiation[x+1][y]=true;
                }
                else{
                initiation[x+1][y]=false;
                }
                if(initiation[x][y+1]==true){
                 initiation[x][y+1]=false;
                }
                else{
                 initiation[x][y+1]=true;
                }
                if(initiation[x-1][y]==true){
                 initiation[x-1][y]=false;
                }
                else{
                 initiation[x-1][y]=true;
                }
                if(initiation[x][y-1]==true){
                 initiation[x][y-1]=false;
                }
                else{
                 initiation[x][y-1]=true;
                }
        }
        }
        else{
             initiation[x][y]=false;
             if(x==0 && y!=0 && y!=initiation.length-1){ // pour le bord gauche  
                if(initiation[x+1][y]==false){
                   initiation[x+1][y]=true;
                }
                else{
                 initiation[x+1][y]=false;
                }
                if(initiation[x][y+1]==true){
                     initiation[x][y+1]=false;
                }
                else{
                     initiation[x][y+1]=true;
                } 
                if(initiation[x][y-1]==false){
                   initiation[x][y-1]=true;
                }
                else{
                 initiation[x][y-1]=false;
                }
            }
            if(y==0 && x!=0 && x!=initiation.length-1){  //pour le bord du haut  
                if(initiation[x+1][y]==false){
                initiation[x+1][y]=true;
                }
                else{
                initiation[x+1][y]=false;
                }
                if(initiation[x][y+1]==true){
                 initiation[x][y+1]=false;
                }
                else{
                 initiation[x][y+1]=true;
                }
                if(initiation[x-1][y]==true){
                 initiation[x-1][y]=false;
                }
                else{
                 initiation[x-1][y]=true;
                }
            }
            if(y==initiation.length-1 && x!=0 && x!=initiation.length-1){ // bord bas  
                if(initiation[x+1][y]==true){
                 initiation[x+1][y]=false;
                }
                else{
                 initiation[x+1][y]=true;
                }
                if(initiation[x-1][y]==true){
                 initiation[x-1][y]=false;
                }
                else{
                 initiation[x-1][y]=true;
                }
                if(initiation[x][y-1]==true){
                 initiation[x][y-1]=false;
                }
                else{
                 initiation[x][y-1]=true;
                }

            }
            if(x==initiation.length-1 && y!=0 && y!=initiation.length-1){// bord de droite  
                if(initiation[x][y+1]==true){
                 initiation[x][y+1]=false;
                }
                else{
                 initiation[x][y+1]=true;
                }
                if(initiation[x-1][y]==true){
                 initiation[x-1][y]=false;
                }
                else{
                 initiation[x-1][y]=true;
                }
                if(initiation[x][y-1]==true){
                 initiation[x][y-1]=false;
                }
                else{
                 initiation[x][y-1]=true;
                }
            }
            if(x==0 && y==0){ // coin haut gauche  

                if(initiation[1][0]==false){
                initiation[1][0]=true;
                }
                else{
                initiation[1][0]=false;
                }
                if(initiation[0][1]==true){
                 initiation[0][1]=false;
                }
                else{
                 initiation[0][1]=true;
                }
            }
            if(x==0 && y==4){ // coin bas gauche  
                if(initiation[0][3]==true){
                 initiation[0][3]=false;
                }
                else{
                 initiation[0][3]=true;
                }
                if(initiation[1][4]==true){
                 initiation[1][4]=false;
                }
                else{
                 initiation[1][4]=true;
                }
            }
            if(x==initiation.length-1 && y==0){ // coin haut droite  
                if(initiation[x][y+1]==true){
                 initiation[x][y+1]=false;
                }
                else{
                 initiation[x][y+1]=true;
                }
                if(initiation[x-1][y]==true){
                 initiation[x-1][y]=false;
                }
                else{
                 initiation[x-1][y]=true;
                }
            }
            if(x==initiation.length-1 && y==initiation.length-1){ // coin bas droite  
                
                if(initiation[x-1][y]==true){
                 initiation[x-1][y]=false;
                }
                else{
                 initiation[x-1][y]=true;
                }
                if(initiation[x][y-1]==true){
                 initiation[x][y-1]=false;
                }
                else{
                 initiation[x][y-1]=true;
                }
            }
            
        
            
        if(x!=0 && x!=initiation.length-1 && y!=0 && y!=initiation.length-1){ //centre 
                if(initiation[x+1][y]==false){
                initiation[x+1][y]=true;
                }
                else{
                initiation[x+1][y]=false;
                }
                if(initiation[x][y+1]==true){
                 initiation[x][y+1]=false;
                }
                else{
                 initiation[x][y+1]=true;
                }
                if(initiation[x-1][y]==true){
                 initiation[x-1][y]=false;
                }
                else{
                 initiation[x-1][y]=true;
                }
                if(initiation[x][y-1]==true){
                 initiation[x][y-1]=false;
                }
                else{
                 initiation[x][y-1]=true;
                }
        }
        }
        
        }
     
          public String toString(){
        String s="";
    for (int i=0; i<initiation.length;i++){
            for (int j=0; j<initiation.length;j++){
                if (initiation[i][j]){
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
        for (int i=0; i<initiation.length;i++){
            for (int j=0; j<initiation.length;j++){
                if(initiation[i][j]){
                    return false; 
                }
            }
            
    }
        return true;
}
}
