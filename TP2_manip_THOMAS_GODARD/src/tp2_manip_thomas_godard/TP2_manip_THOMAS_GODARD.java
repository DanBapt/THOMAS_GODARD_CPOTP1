/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_manip_thomas_godard;

/**
 *
 * @author danielthomas
 */
public class TP2_manip_THOMAS_GODARD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tartiflette assiette1 = new Tartiflette(500);
        Tartiflette assiette2 = new Tartiflette(600);
        Tartiflette assiette3 = assiette2;
        /* 
        4. 2 tartiflettes ont été créées 
        Assiette2 et assiette3 référencent la même tartiflette
        */
        System.out.println("nb de calories de Assiette 2 : " + assiette2.nbCalories) ;
        System.out.println("nb de calories de Assiette 3 : " + assiette3.nbCalories) ;
        
        Tartiflette permut;
        permut = assiette1;
        assiette1 = assiette2;
        assiette2 = permut;
        System.out.println("nb de calories de Assiette 1 : " + assiette1.nbCalories) ;
        System.out.println("nb de calories de Assiette 2 : " + assiette2.nbCalories) ;
        
        /*
        Moussaka assiette666 = assiette1;
        Moussaka assiette667 = new Tartiflette ();
        6. Ces lignes ne sont pas correctes. Une référence objet qui annonce référencer un type d’objet ne peut pas référencer un autre qui n’a aucun rapport 
        
        Moussaka tableau;
        Moussaka [] Tab = new Moussaka [10];
        for(int i=0; i<=10; i++){
            tableau = new Moussaka(400);
            Tab[i]=tableau;
        }
            
       */

    }
    
}
