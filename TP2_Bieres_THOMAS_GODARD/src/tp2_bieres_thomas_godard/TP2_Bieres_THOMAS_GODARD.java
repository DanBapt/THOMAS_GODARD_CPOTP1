/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_thomas_godard;

/**
 *
 * @author danielthomas
 */
public class TP2_Bieres_THOMAS_GODARD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//         BouteilleBiere uneBiere = new BouteilleBiere() ;
//        
//        uneBiere.Nom = "Cuvée des trolls";
//        uneBiere.degreAlcool =  7.0 ;
//        uneBiere.brasserie = "Dubuisson";
//        uneBiere.ouverte = false;
//        
//        uneBiere.lireEtiquette();
//
//        BouteilleBiere uneBiere2 = new BouteilleBiere() ;
//        
//        uneBiere2.Nom = "Leffe";
//        uneBiere2.degreAlcool = 6.6 ;
//        uneBiere2.brasserie = "Abbaye de Leffe";
//        uneBiere2.ouverte = false; 
        
//        uneBiere2.lireEtiquette(); 
     
        BouteilleBiere Trolls = new BouteilleBiere("Cuvée des trolls",7.0 ,"Dubuisson") ;
        BouteilleBiere Leffe = new BouteilleBiere("Leffe", 6.6,"Abbaye de Leffe") ;
        BouteilleBiere Pelforth = new BouteilleBiere("Baptbierre",5.8 ,"brasserie de Bapt'art") ;
        BouteilleBiere Chouffe = new BouteilleBiere("bibierre", 8.0 ,"Bartiste") ;
        BouteilleBiere demon = new BouteilleBiere("Bière", 12.0 ,"brasserie de labas") ;
        
        Trolls.lireEtiquette();
        Leffe.lireEtiquette();
        Pelforth.lireEtiquette();
        Chouffe.lireEtiquette();
        demon.lireEtiquette();
       
    }
    
}
