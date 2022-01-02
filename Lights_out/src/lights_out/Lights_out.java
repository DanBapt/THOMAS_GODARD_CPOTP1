/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lights_out;

import java.util.Scanner;

/**
 *
 * @author danielthomas
 */
public class Lights_out {

    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) {
        
        
//        // TODO code application logic here
//    PartieL g=new PartieL(5);
//    System.out.print(g);
//    }

Scanner sc = new Scanner(System.in);

System.out.print("choisissez un niveau de difficulté :" + "\n" + "1:initiation" + "\n" + "2:aléatoire" + "\n"  + "3:difficile");
int niveau = sc.nextInt();
int cpt=0;
int cpt2=0;
    
    
   
 
    
    if(niveau == 2){
        Grille jeu = new Grille(5);
        jeu.aleat();
        
            System.out.print(jeu);

   while(jeu.finpartie()==false){
//   while(true){
   

    int x= sc.nextInt();
    int y= sc.nextInt();
    cpt++;

    System.out.print("X= "+x);
    System.out.print("Y= "+y+"\n");
    jeu.clic(y,x);
    System.out.print("nombre de coup: "+cpt+"\n");
    System.out.print(jeu);
    
       if (jeu.finpartie()==true){
        System.out.print("Bravo vous avez gagné en "+ cpt+" coup"+"\n");
        }
       
   }

    }
    if(niveau == 1){
        initiation grillefacile= new initiation(5);

       
        System.out.print(grillefacile);
while(grillefacile.finpartie2()==false){
  cpt++;

    int x= sc.nextInt();
    int y= sc.nextInt();
    System.out.print("X= "+x);
    System.out.print("Y= "+y+"\n");
    grillefacile.clic2(y,x);
    System.out.print("nombre de coup: "+cpt+"\n");
    System.out.print(grillefacile);
     if (grillefacile.finpartie2()==true){
        System.out.print("Bravo vous avez gagné en "+ cpt+" coup");
        }
}
}
}
}

