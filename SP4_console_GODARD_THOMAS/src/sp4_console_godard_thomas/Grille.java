/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp4_console_godard_thomas;

/**
 *
 * @author danielthomas
 */
public class Grille {
    Cellule CelluleJeu[][]=new Cellule[6][7];
    public void Grille(){
        CelluleJeu=new Cellule [6][7];
    }
    public boolean ajouterJetonDansColonne(Jeton jtn,int x){
        
    }
    public boolean etreRemplie(){
        for (int i=0;i<6;i++){
            if (CelluleJeu[6][i]!=null){
                return true;
            }
        }
        return false;
    }
    public void viderGrille(){
        CelluleJeu[][]=null;
    }
    public void afficherGrilleSurConsole(){
        
    }
    public boolean celluleOccupee(int x,int y){
        
    }
    public String lireCouleurDuJeton(int x, int y){
        
    }
    public boolean etreGagnantePourJoueur(Joueur joueur){
        
    }
    public void tasserGrille(int a){
        
    }
    public boolean colonneRemplie(int b){
        
    }
    public boolean placerDesintegrateur(int x, int y){
        
    }
    public boolean placerTrouNoir(int x,int y){
        
    }
    public boolean supprimerJeton(int x,int y){
        
    }
}
