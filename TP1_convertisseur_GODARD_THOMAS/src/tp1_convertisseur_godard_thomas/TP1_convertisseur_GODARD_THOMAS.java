/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package convertisseur_godard_thomas;

import java.util.Scanner;

/**
 *
 * @author 33666
 */
public class Convertisseur_GODARD_THOMAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc;
        sc = new Scanner(System.in);
        System.out.println("entrer un réel");
        float ent1 = sc.nextFloat();
        float ent2 = ent1 + 273,2 ;
        System.out.println(ent1+"°C");
        System.out.println(ent2+"K");
        
    
  


        int rep;
        do { 
            rep = menu(); 
            switch (rep) {
                case 1: 
                    CelciusVersKelvin(ent1);
                    System.out.println(FarenheitVersKelvin (ent1));
                    break;
                case 2:
                    KelvinVersCelcius(ent1);
                    System.out.println(FarenheitVersKelvin (ent1));
                    break;
                case 3: 
                    FarenheitVersKelvin(ent1);
                    System.out.println(FarenheitVersKelvin (ent1));
                case 4:
                    KelvinVersFarenheit(ent1);
                    System.out.println(KelvinVersFarenheit (ent1));
                    break;
                case 5:
                    CelciusVersFarenheit(ent1);
                    System.out.println(FarenheitVersKelvin (ent1));
                    break;
                case 6:
                    FarenheitVersCelcius(ent1);
                    System.out.println(FarenheitVersKelvin (ent1));
                    break;
                default:
                    System.out.println("Choix non valide");
                    break;
            }
        } while (rep > 6); 
        
}    
        
    
    public static float CelciusVersKelvin ( float tempCelcius) {
        
        float tempKelvin = tempCelcius+273.15f;
        return tempKelvin;

    }
    public static float KelvinVersCelcius ( float tempKelvin) {
        
        float tempCelcius = tempKelvin-273.15f;
        return tempCelcius;

    }
    public static float FarenheitVersCelcius ( float tempFarenheit) {
        
        float tempCelcius = (tempFarenheit-32)*5f/9;
        return tempCelcius;

    }
    public static float CelciusVersFarenheit ( float tempCelcius) {
        
        float tempFarenheit = (tempCelcius*9f/5)+32;
        return tempFarenheit;

    }
    public static float KelvinVersFarenheit ( float tempKelvin) {
        
        float tempFarenheit = ((tempKelvin-273.15f)*9f/5)+32;
        return tempFarenheit;

    }
    public static float FarenheitVersKelvin ( float tempFarenheit) {
        
        float tempKelvin = ((tempFarenheit-32f)*5f/9)+273.15f;
        return tempKelvin;

    }
    
    public static int menu() {
        
        Scanner sc;
        int rep;
        sc = new Scanner(System.in);
        System.out.println("Saisissez la convertion que vous voulez effectuer :");
        System.out.println("1) De Celcius vers Kelvin");
        System.out.println("2) De Kelvin vers Celcius");
        System.out.println("3) De Farenheit vers Kelvin");
        System.out.println("4) De Kelvin vers Farenheit");
        System.out.println("5) De Celcius vers Farenheit");
        System.out.println("6) De Farenheit vers Celcius");
        rep = sc.nextInt();
        return rep;
    }      
    }
    