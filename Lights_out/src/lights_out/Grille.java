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
    

    public void clic(int x, int y){        
        if ( Grille[x][y]==false){
             Grille[x][y]=true;
             // 4 coins + Bords bas et droite 
             
            if(x==1 && y!=1 && y!=Grille.length){
                if(Grille[x+1][y]==false){
                   Grille[x+1][y]=true;
            }
                else if(Grille[x+1][y]==true){
                 Grille[x+1][y]=false;
            }
                if(Grille[x][y+1]==true){
                     Grille[x][y+1]=false;
             }
                else if(Grille[x][y+1]==false){
                     Grille[x][y+1]=true;
             } 
                if(Grille[x-1][y]==false){
                   Grille[x-1][y]=true;
            }
                else if(Grille[x-1][y]==true){
                 Grille[x-1][y]=false;
            }
            }
            else if(y==1 && x!=1 && x!=Grille.length){
                if(Grille[x+1][y]==false){
                Grille[x+1][y]=true;
            }
            else if(Grille[x+1][y]==true){
                Grille[x+1][y]=false;
            }
             if(Grille[x][y+1]==true){
                 Grille[x][y+1]=false;
             }
             else if(Grille[x][y+1]==false){
                 Grille[x][y+1]=true;
             }
             if(Grille[x][y-1]==true){
                 Grille[x][y-1]=false;
             }
             else if(Grille[x][y-1]==false){
                 Grille[x][y-1]=true;
             }
            }
             else if(y==Grille.length && x!=1 && x!=Grille.length){
       if(Grille[x+1][y]==false){
                Grille[x+1][y]=true;
            }
            else if(Grille[x+1][y]==true){
                Grille[x+1][y]=false;
            }
             if(Grille[x][y+1]==true){
                 Grille[x][y+1]=false;
             }
//             else if(Grille[x][y+1]==false){
//                 Grille[x][y+1]=true;
//             }
//             if(Grille[x-1][y]==true){
//                 Grille[x-1][y]=false;
//             }
             else if(Grille[x-1][y]==false){
                 Grille[x-1][y]=true;
             }
             if(Grille[x][y-1]==true){
                 Grille[x][y-1]=false;
             }
             else if(Grille[x][y-1]==false){
                 Grille[x][y-1]=true;
             }

            }
//            else{
//            if(Grille[x+1][y]==false){
//                Grille[x+1][y]=true;
//            }
//            else if(Grille[x+1][y]==true){
//                Grille[x+1][y]=false;
//            }
//             if(Grille[x][y+1]==true){
//                 Grille[x][y+1]=false;
//             }
//             else if(Grille[x][y+1]==false){
//                 Grille[x][y+1]=true;
//             }
//             if(Grille[x-1][y]==true){
//                 Grille[x-1][y]=false;
//             }
//             else if(Grille[x-1][y]==false){
//                 Grille[x-1][y]=true;
//             }
//             if(Grille[x][y-1]==true){
//                 Grille[x][y-1]=false;
//             }
//             else if(Grille[x][y-1]==false){
//                 Grille[x][y-1]=true;
//             }
//        
//        
//        else{
//            Grille[x][y]=false;
//            
//           if(Grille[x+1][y]==false){
//                Grille[x+1][y]=true;
//            }
//            else if(Grille[x+1][y]==true){
//                Grille[x+1][y]=false;
//            }
//             if(Grille[x][y+1]==true){
//                 Grille[x][y+1]=false;
//             }
//             else if(Grille[x][y+1]==false){
//                 Grille[x][y+1]=true;
//             }
//             if(Grille[x-1][y]==true){
//                 Grille[x-1][y]=false;
//             }
//             else if(Grille[x-1][y]==false){
//                 Grille[x-1][y]=true;
//             }
//             if(Grille[x][y-1]==true){
//                 Grille[x][y-1]=false;
//             }
//             else if(Grille[x][y-1]==false){
//                 Grille[x][y-1]=true;
//             }
//        
//        }
//        }
//        }
//        }
//        
//      
//    public void aleat(){
//        String s="";
//        for (int i=0; i<Grille.length;i++){
//            for (int j=0; j<Grille.length;j++){
//             Random r = new Random();
//             int x= r.nextInt(2);
//             if(x==0){
//                Grille[i][j]= true;
//            }
//            }
      
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