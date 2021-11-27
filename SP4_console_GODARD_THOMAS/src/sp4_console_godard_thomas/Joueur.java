/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp4_console_godard_thomas;


//Classe joueur :
//Attributs :
//• Nom : nom du joueur
//• Couleur : couleur affectée au joueur
//• ListeJetons : tableau de 21 cases décrivant les jetons encore en possession du
//joueur
//• nombreJetonsRestants: nombre de jetons restant en possession du joueur,
//correspondant à la taille effective de ListeJetons
//• nombreDesintegrateurs : nombre de désintégrateurs actuellement en possession
//Méthodes :
//• Joueur (String) : constructeur initialisant le nom du joueur avec son paramètre
//• affecterCouleur(String): affecte la couleur en paramètre au joueur
//• ajouterJeton(Jeton) : ajoute le jeton passé en paramètre à la liste des jetons
//• obtenirDesintegrateur() : incrémente le nombre de désintégrateurs du joueur
//• utiliserDesintegrateur() : décrémente le nombre de désintégrateurs et confirme
//l’utilisation de ce dernier, ou renvoie faux s’il ne restait plus de désintégrateurs.
//

/**
 *
 * @author danielthomas
 */
public class Joueur {
    String Nom;
    String Couleur; 
   Jeton ListeJetons[];
   int nombreJetonsRestants;
   int nombreDesintegrateur;


 public  Joueur(String unNom ){
     Nom = unNom; 
     ListeJetons=new Jeton [21];
        nombreJetonsRestants=0;
        nombreDesintegrateur=0;
 }
 
 public void affecterCouleur(String uneCouleur){
     Couleur = uneCouleur;
 }
// affecterCouleur(String): affecte la couleur en paramètre au joueur }
 
 public boolean ajouterJeton(Jeton j){ 
//     ajouterJeton(Jeton) : ajoute le jeton passé en paramètre à la liste des jetons
for(int i=0; i<ListeJetons.length; i++){
    if (ListeJetons[i]==null){
        nombreJetonsRestants=nombreJetonsRestants+1;
        ListeJetons[i]=j;
            return true;

    }
}
//retourner une valeur de type jeton 
        return false;
}
 public void obtenirDesintegrateur(){
     nombreDesintegrateur++;
 }
 public boolean utiliserDesintegrateur(){
    if (nombreDesintegrateur==0){
            return false;
        }
        else {
            nombreDesintegrateur--;
            return true;
        }
    } 
 
}