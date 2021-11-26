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
    public boolean ajouterJetonDansColonne(Jeton jtn,int colonne){
        int ligne=0;
        while (ligne<6 && CellulesJeu[ligne][colonne].jetonCourant==null){ 
            ligne++; 
        }
        if (ligne==0) {
            return false;
        }
        else {
            ligne--;
            CellulesJeu[ligne][colonne].jetonCourant=jtn;
        
            if (CellulesJeu[ligne][colonne].presenceTrouNoir()==true){
                CellulesJeu[ligne][colonne].activerTrouNoir();
            }
            return true;
        }
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
        if (celluleOccupee(i,j)){
            return CellulesJeu[i][j].jetonCourant.Couleur; 
        }
        else {
            return "pas de couleur";
        }
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
    public boolean placerDesintegrateur(int i, int j){
        return CellulesJeu[i][j].placerDesintegrateur();
    }
    public boolean placerTrouNoir(int i,int j){
        return CellulesJeu[i][j].presenceTrouNoir();
    }
    public boolean supprimerJeton(int i,int j){
        return CellulesJeu[i][j].supprimerJeton();
    }
    public Jeton recupererJeton(int i,int j){
        return CellulesJeu[i][j].recupererJeton();
    }
}
