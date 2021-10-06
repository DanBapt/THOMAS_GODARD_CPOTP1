/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package manipnombresint_thomas_godard;

import java.util.Scanner;

/**
 *
 * @author danielthomas
 */
public class ManipNombresInt_THOMAS_GODARD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc;
        sc = new Scanner(System.in);
        System.out.println("entrer un premier entier");
        System.out.println("entrer un deuxième entier");
        int ent1 = sc.nextInt();
        int ent2 = sc.nextInt();
        int add = ent1 + ent2;
        int minus = ent1 - ent2;
        int mult = ent1 * ent2;
        int div = ent1 / ent2;
        System.out.println("La somme des entiers est: " + add);
        System.out.println("La différence des entiers est: " + minus);
        System.out.println("La multiplication des entiers est: " + mult);
        System.out.println("La division des entiers est: " + div);
        int reste= ent1%ent2;
        System.out.println("Le quotient de la division des entiers est: " + div + " Le reste de la division des entiers est:" + reste);
    }
    }
    
