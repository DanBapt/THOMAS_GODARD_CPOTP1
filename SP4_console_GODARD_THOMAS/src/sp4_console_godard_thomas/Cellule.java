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
    
    public void Cellule(){
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
        if(jetonCourant!=null) { //danib

            jetonCourant=null;

            return(true);
    }
    public boolean placerTrouNoir(){
        if (trouNoir){
            return false;
        }
        else {
            trouNoir=true;
            return true;
    }
    public boolean placerDesintegrateur(){
        
    }
    public boolean presenceTrouNoir(){
        if (trouNoir==true){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean presenceDesintegrateur(){
        if (desintegrateur==true){
            return true;
        }
        else{
            return false;
        }
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
        return (desintegrateur);
    }
    public boolean activerTrouNoir(){
        
    }
}
