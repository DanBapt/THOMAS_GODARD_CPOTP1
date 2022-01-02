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

System.out.print("1=facile 2= normal");
int niveau = sc.nextInt();
int cpt=0;
    
    
   
 
    
    if(niveau == 2){
        Grille jeu = new Grille(5);
//        jeu.aleat();
        
            System.out.print(jeu);

//   while(jeu.finpartie()==false){
   while(true){
   

    int x= sc.nextInt();
    int y= sc.nextInt();
    

    System.out.print("X= "+x);
    System.out.print("Y= "+y+"\n");
    jeu.clic(y,x);
    System.out.print("nombre de coup: "+jeu.clic(y,x)+"\n");
    cpt=jeu.clic(y,x);
    System.out.print(jeu);
    //   if (jeu.finpartie()==true){
//        System.out.print("Bravo vous avez gagné en "+ cpt+" coup"+"\n");
//        }
   }

    }
    if(niveau == 1){
        initiation grillefacile= new initiation(5);

       
        System.out.print(grillefacile);
while(grillefacile.finpartie2()==false){
  

    int x= sc.nextInt();
    int y= sc.nextInt();
    System.out.print("X= "+x);
    System.out.print("Y= "+y+"\n");
    grillefacile.clic2(y,x);
    System.out.print("nombre de coup: "+grillefacile.clic2(y,x)+"\n");
     cpt=grillefacile.clic2(y,x);
    System.out.print(grillefacile);
     if (grillefacile.finpartie2()==true){
        System.out.print("Bravo vous avez gagné en "+ cpt+" coup");
        }
}
}
}
}

