/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lights_out;

/**
 *
 * @author danielthomas
 */
class Grille {
    Bouton [][] BoutonJeu=new Bouton[5][5];
    public Grille(){
        for (int i=0;i<5;i++){
            for (int j=0;j<5;j++){
                BoutonJeu[i][j]=new Bouton();
            }
        }
    }
    public boolean etreGagnant(){
        for (int i=0;i<5;i++){
            for (int j=0;i<5;j++){
                if (BoutonJeu[i][j].couleur=="blanc"){
                    return false;
                }
        if (BoutonJeu)
                }
            }
        }
    }
}
