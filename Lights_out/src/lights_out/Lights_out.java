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



System.out.println("entrez votre pseudo: ");
String nomJ= sc.nextLine();
System.out.print("choisissez un niveau de difficulté :" + "\n" + "1:initiation" + "\n" + "2:aléatoire" + "\n"  + "3:difficile"+"\n");
int niveau = sc.nextInt();
int cpt=0;

Joueur j= new Joueur(nomJ);  

 
    
    if(niveau == 2){ // niveau aléatoire 
        Grille jeu = new Grille(5);
        jeu.aleat();
        System.out.print(jeu);
        System.out.println("entrez un numero de colonne entre 0 et 4 puis un numero de ligne entre 0 et 4");

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
        System.out.print("Bravo " +nomJ+ ", tu as gagné en "+ cpt+" coup"+"\n");
        }
       
   }

    }
    if(niveau == 1){ // niveau initiation
        initiation grillefacile= new initiation(5);
        System.out.print(grillefacile);
        System.out.println("entrez un numero de colonne entre 0 et 4 puis un numero de ligne entre 0 et 4");
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
        System.out.print("Bravo " +nomJ+ ", tu as gagné en "+ cpt+" coup"+"\n");        }
}
}
    if(niveau==3){ // niveau difficile
        hard grillehard= new hard(5);
        System.out.print(grillehard);
        System.out.println("entrez un numero de colonne entre 0 et 4 puis un numero de ligne entre 0 et 4");
while(grillehard.finpartie2()==false){
  cpt++;

    int x= sc.nextInt();
    int y= sc.nextInt();
    System.out.print("X= "+x);
    System.out.print("Y= "+y+"\n");
    grillehard.clic2(y,x);
    System.out.print("nombre de coup: "+cpt+"\n");
    System.out.print(grillehard);
     if (grillehard.finpartie2()==true){ 
        System.out.print("Bravo " +nomJ+ ", tu as gagné en "+ cpt+" coup"+"\n");        }
}

    }
}
}
