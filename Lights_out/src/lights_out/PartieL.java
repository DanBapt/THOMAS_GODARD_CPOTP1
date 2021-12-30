/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lights_out;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author danielthomas
 */
public class PartieL {
   Grille Grillejeu = new Grille();
    public void aleat(){
        String s="";
        for (int i=0; i<Grillejeu.length;i++){
            for (int j=0; j<Grillejeu.length;j++){
             Random r = new Random();
             int x= r.nextInt(2);
             if(x==0){
                Grillejeu[i][j]= true;
            }
            }
        }
    }
}
