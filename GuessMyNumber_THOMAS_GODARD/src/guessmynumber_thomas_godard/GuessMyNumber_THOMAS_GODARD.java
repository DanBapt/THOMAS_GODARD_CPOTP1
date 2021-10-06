/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guessmynumber_thomas_godard;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author danielthomas
 */
public class GuessMyNumber_THOMAS_GODARD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 1) 
        Random generateurAleat = new Random();
        int n = generateurAleat.nextInt(100);
        System.out.println(n);
        System.out.println(generateurAleat.nextInt(100));
        System.out.println(generateurAleat.nextInt(100));
        System.out.println(generateurAleat.nextInt(100));
        System.out.println(generateurAleat.nextInt(100));

        //2) 
        Scanner sc = new Scanner(System.in);
        System.out.println("\n Choisissez un niveau de difficulté : \n 1 pour facile \n 2 pour normal \n 3 pour difficile");
        int cpt = 1;
        int x = 0;
        int diff = 0;
        diff = sc.nextInt();

        if (diff == 1) {

            System.out.println("\n Entrer un nombre compris entre 0 et 50 :");
            x = generateurAleat.nextInt(50);
//            System.out.println("\n" + "X=" + x);

        }
        if (diff == 3) {
            System.out.println("\n Entrer un nombre compris entre 0 et 200 :");
            x = generateurAleat.nextInt(200);
//            System.out.println("\n" + "X=" + x);

        }
        if (diff == 2) {
            System.out.println("\n Entrer un nombre compris entre 0 et 100 :");
            x = generateurAleat.nextInt(100);
//            System.outs.println("\n" + "X=" + x);
        }

        int nb = sc.nextInt();

        while (nb != x) {

            if (nb < x) {

                System.out.println("\n trop petit");

                if (diff == 1) {

                    if (x - nb >= 10) {
                        System.out.println("vraiment trop petit");
                    }
                }
            }
            if (nb > x) {

                System.out.println("\n trop grand");

                if (diff == 1) {

                    if (nb - x >= 10) {

                        System.out.println("vraiment trop grand");
                    }
                }
            }

            System.out.println("\n Réessayez ");
            cpt = cpt + 1;
            nb = sc.nextInt();
            if (diff == 3) {

            if (cpt >= 10) {
                System.out.println("\n vous avez perdu !");
            }
        }

        }
        if (nb == x) {
            System.out.println("\n gagné !");
        }
        
        System.out.println("\n compteur:" + cpt);
    }
}
