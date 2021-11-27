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
    Cellule [][] CellulesJeu=new Cellule[6][7];
    public void Grille(){
        for (int i=0; i<6; i++){
            for (int j = 0; j < 7; j++) {
                CellulesJeu[i][j] = new Cellule();
            }
        }
    }
    public boolean ajouterJetonDansColonne(Jeton jeton, int colonne, Joueur joueurcourant){// j'ai rajouté une entree de type joueur pour pouvoir incrementer son nombre de desintegrateur.
        int i=0;
        while (i<6 && CellulesJeu[i][colonne].jetonCourant==null){ 
            i++; // i augmente de 1 si la cellule est vide cela signifie que l'on descend de 1 dans la colonne 
        }
        if (i==0) {
            return false;// car cela signifie que la colonne est pleine
        }
        else {
            i--;// on revient sur cellule du dessus car lorsque l'on sort de la boucle cela veut dire que la cellule du i actuel est soit occupee soit i a depacer la grille.
            CellulesJeu[i][colonne].jetonCourant=jeton;
            if (presenceTrouNoir2(i,colonne)){
                CellulesJeu[i][colonne].activerTrouNoir();
            }
            if (presenceDesintegrateur2(i,colonne)){
                CellulesJeu[i][colonne].recupererDesintegrateur();
                joueurcourant.nombreDesintegrateur++;// si il y a presence d'un desintegrateur on le supprime avec recupererdesintegrateur puis on incremente son nombre de desintegrateur qu'il a en sa possession.
            }
            return true;
        }
    }
    public boolean etreRemplie(){
        for (int j=0; j<7; j++){
            for (int i=0; i<6;i++){ 
                if (CellulesJeu[i][j].jetonCourant==null){
                    return false;
                }
            }
        }
        return true;
    }
    public void viderGrille(){
         for (int j=0; j<7; j++){
            for (int i=0; i<6;i++){ 
                if (CellulesJeu[i][j].jetonCourant!=null){
                    CellulesJeu[i][j].jetonCourant=null;
                    
                }
                CellulesJeu[i][j].trouNoir=false;
                CellulesJeu[i][j].desintegrateur=false;
            }
        }
    }
    
    public void afficherGrilleSurConsole(){
         for (int i=0; i<6;i++){
            System.out.println();
            for (int j=0; j<7; j++){
                if (CellulesJeu[i][j].jetonCourant!=null){
                    if(CellulesJeu[i][j].jetonCourant.Couleur=="rouge"){
                        System.out.print(" R ");
                    }
                    else{
                        System.out.print(" J ");
                    }
                }
                else {
                    if(CellulesJeu[i][j].trouNoir){
                        System.out.print(" T ");
                    }
                    else if(CellulesJeu[i][j].desintegrateur && CellulesJeu[i][j].trouNoir==false){
                        System.out.print(" D ");
                    }
                    else {
                        System.out.print("  ");
                    }
                }
            }
        }
    }
    public boolean celluleoccupee(int i,int j){
        if(CellulesJeu[i][j].jetonCourant==null){
            return false;
        }
        else{
            return true;        
        }
    }
    public String lireCouleurDuJeton(int i, int j){
        if (celluleoccupee(i,j)){
            return CellulesJeu[i][j].jetonCourant.Couleur;
        }
        else {
            return "pas de couleur";
        }
    }
    public boolean etreGagnantePourJoueur(Joueur joueur){
      
        for (int j=0; j<4; j++){
            for (int i=0; i<6;i++){
                if(joueur.Couleur.equals(lireCouleurDuJeton(i,j)) && joueur.Couleur.equals(lireCouleurDuJeton(i,j+1)) && joueur.Couleur.equals(lireCouleurDuJeton(i,j+2)) && joueur.Couleur.equals(lireCouleurDuJeton(i,j+3))){//
                    return true;
                }
            }
        }
        // vérifions par colonne
        for (int j=0; j<7; j++){
            for (int i=0; i<3;i++){
                if(joueur.Couleur.equals(lireCouleurDuJeton(i,j)) && joueur.Couleur.equals(lireCouleurDuJeton(i+1,j)) && joueur.Couleur.equals(lireCouleurDuJeton(i+2,j)) && joueur.Couleur.equals(lireCouleurDuJeton(i+3,j))){// on verifie les diagonales descendantes
                    return true;
                }
            }
        }
        //vérifions par diagonales descendantes
        for (int j=0; j<4; j++){
            for (int i=0; i<3;i++){
                if(joueur.Couleur.equals(lireCouleurDuJeton(i,j)) && joueur.Couleur.equals(lireCouleurDuJeton(i+1,j+1)) && joueur.Couleur.equals(lireCouleurDuJeton(i+2,j+2)) && joueur.Couleur.equals(lireCouleurDuJeton(i+3,j+3))){
                    return true;
                }
            }
        }
        //vérifions par diagonales montantes
        for (int j=0; j<4; j++){
            for (int i=3; i<6;i++){
                if(joueur.Couleur.equals(lireCouleurDuJeton(i,j)) && joueur.Couleur.equals(lireCouleurDuJeton(i-1,j+1)) && joueur.Couleur.equals(lireCouleurDuJeton(i-2,j+2)) && joueur.Couleur.equals(lireCouleurDuJeton(i-3,j+3))){
                    return true;
                }
            }
        }
        return false;
    }
    public void tasserGrille(int j){
        for (int i=5;i>0;i--){
            if (CellulesJeu[i][j].jetonCourant==null && CellulesJeu[i-1][j].jetonCourant!=null){
                for (; i>0;i--){//le i est déjà initialisé avant la boucle for donc on n'a pas besoins de l'initialisé ici
                    if (CellulesJeu[i-1][j].jetonCourant!=null){
                        CellulesJeu[i][j].jetonCourant=CellulesJeu[i-1][j].jetonCourant;
                        CellulesJeu[i-1][j].supprimerJeton();
                    }
                }
            }
        }
    }
    public void tasserColonne(int j){
        for (int i=5;i>0;i--){// on part du bas de la grille et on remonte jusqu'a qu'une case soit vide et que celle du dessus ne le soit pas
            if (CellulesJeu[i][j].jetonCourant==null && CellulesJeu[i-1][j].jetonCourant!=null){//si une case est vide et que celle du dessus ne l'est pas pas on rentre dans la boucle for
                for (; i>0;i--){// cette boucle permet de baisser chaque jeton d'une case
                    if (CellulesJeu[i-1][j].jetonCourant!=null){// on verifie bien que la case du dessus est une couleur sinon ce la ne sert a rien de faire l'instruction suivante
                        CellulesJeu[i][j].jetonCourant=CellulesJeu[i-1][j].jetonCourant;// on affecte le jeton courant a la case d'en dessous
                        CellulesJeu[i-1][j].supprimerJeton();// maintenant que ce jeton est present dans la cellule d'en dessous on peut le supprimer
                    }
                }
            }
        }
    }
    public void tasserGrille2(){
        for (int j=0; j<7 ; j++){
            tasserColonne(j);
        }
    }
    public boolean colonneRemplie(int j){
        for(int i=0;i<6;i++){
            if (CellulesJeu[i][j].jetonCourant==null){
                return false;
            }
        }
        return true;
    }
    public boolean placerDesintegrateur(int i, int j){
        return CellulesJeu[i][j].placerDesintegrateur();
    }
    public boolean placerTrouNoir(int i,int j){
        return CellulesJeu[i][j].placerTrouNoir();
    }
    public boolean presenceTrouNoir2(int i,int j){
        return CellulesJeu[i][j].presenceTrouNoir();
    }
    public boolean presenceDesintegrateur2(int i,int j){
        return CellulesJeu[i][j].presenceDesintegrateur();
    }
    public boolean supprimerJeton(int i,int j){
        return CellulesJeu[i][j].supprimerJeton();
    }
    public Jeton recupererJeton2(int i,int j){
        return CellulesJeu[i][j].recupererJeton();
    }
}