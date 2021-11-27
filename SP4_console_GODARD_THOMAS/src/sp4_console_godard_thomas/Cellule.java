/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp4_console_godard_thomas;

/**
 *
 * @author danielthomas
 */
public class Cellule {
    Jeton jetonCourant;
    boolean trouNoir;
    boolean desintegrateur;
   
    public  Cellule(){
        jetonCourant=null;
        desintegrateur=false;
        trouNoir=false;
    }
    public boolean affecterJeton(Jeton jtn){
        if(jetonCourant==null){
            jtn=jetonCourant;
            return true;
        }
        else{
            return false;
        }
    }
    public Jeton recupererJeton(){
          return(jetonCourant);
    }
    public boolean supprimerJeton(){
        if(jetonCourant!=null) {
            jetonCourant=null;
            return true;
        }
        else{
            return false;
        }
    }
    public boolean placerTrouNoir(){
        if (trouNoir){
            return false;
        }
        else {
            trouNoir=true;
            return true;
        }
    }
    public boolean placerDesintegrateur(){
        if (desintegrateur){
            return false;
        }
        else {
            desintegrateur=true;
            return true;
        }
    }
    public boolean presenceTrouNoir(){
        return trouNoir;
       
    }
    public boolean presenceDesintegrateur(){
       return desintegrateur;
    }
    public String lireCouleurDuJeton(){
        if (jetonCourant==null){
            return "vide";
        }
        else{
            return jetonCourant.Couleur;
        }
    }
    public boolean recupererDesintegrateur(){
        if (desintegrateur){
            desintegrateur=false;
            return true;
        }
        else {
            return false;
        }
    }
    public boolean activerTrouNoir(){
        if (trouNoir){
            jetonCourant=null;
            trouNoir=false;
            return true;
        }
        else {
            return false;
        }
    }
}
