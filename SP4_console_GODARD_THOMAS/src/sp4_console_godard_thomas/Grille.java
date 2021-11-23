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
    Cellule CellulesJeu[][]=new Cellule[6][7];
    public void Grille(){
        CellulesJeu=new Cellule [6][7];
    }
    public boolean ajouterJetonDansColonne(Jeton jtn,int x){
        
    }
    public boolean etreRemplie(){
        for (int i=0;i<6;i++){
            if (CellulesJeu[6][i]!=null){
                return true;
            }
        }
        return false;
    }
    public void viderGrille(){
        CellulesJeu[6][7]=null;
    }
    public void afficherGrilleSurConsole(){
        
    }
    public boolean celluleOccupee(int i,int j){
        if(CellulesJeu[i][j]!=null){
            return true;
        }
        else{
            return false;        
        }
    }
    public String lireCouleurDuJeton(int i, int j){
        return CellulesJeu[i][j];
    }
    public boolean etreGagnantePourJoueur(Joueur joueur){
        
    }
    public void tasserGrille(int a){
        
    }
    public boolean colonneRemplie(int j){
        for(j=0;j<6;j++){
            if (CellulesJeu[6][j]!=null){
                return true;
            }
        }
    }
    public boolean placerDesintegrateur(int x, int y){
        
    }
    public boolean placerTrouNoir(int x,int y){
        
    }
    public boolean supprimerJeton(int x,int y){
        
    }
}
