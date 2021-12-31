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



//int y= sc.nextInt();

    Grille jeu = new Grille(5);
   // jeu.aleat();
    System.out.print(jeu);
    while(true){
    System.out.print("entrez les coordonées: "+"\n");
    int x= sc.nextInt();
    int y= sc.nextInt();
    x=x-1;
    y=y-1;
    jeu.clic(y,x);
    System.out.print(jeu);

    
    
        

}


}
}

