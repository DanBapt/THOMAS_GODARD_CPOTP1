/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_stats_godard_thomas;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author 33666
 */
public class TP1_stats_GODARD_THOMAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] Tabstat = new int[6];
        for (int i=0; i <=5; i++){
            Tabstat[i]=0;
        }
        int m;

        Scanner sc = new Scanner(System.in);
        System.out.println("Entrer le nombre :");
        m=sc.nextInt(); 
        
        Random generateurAleat = new Random();
        for (int i=0; i<m; i++){
            int n = generateurAleat.nextInt(6);
            Tabstat[n] = Tabstat[n]+1;
        }
        
        for (int i=0; i<=5; i++){
            System.out.println("face "+(i+1)+" du dé : "+((Tabstat[i])/(float)(m))*100+"%");
        }
    }
    
}
