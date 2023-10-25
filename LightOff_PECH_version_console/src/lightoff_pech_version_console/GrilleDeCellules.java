/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_pech_version_console;
import java.util.Random;
/**
 *
 * @author Camille
 */
public class GrilleDeCellules {
    private CelluleLumineuse[][] matriceCellules;
    private int nbLignes;
    private int nbColonnes;

    /**
     *constructeur d'une matrice remplie de nouvelles cellules lumineuses
     * @param nbLignes 
     * @param nbColonnes
     * constructeur prend en paramètre le nb de lignes et colonnes pourla matrice
     */
    public GrilleDeCellules(int nbLignes, int nbColonnes) {
        this.nbLignes = nbLignes;
        this.nbColonnes = nbColonnes;
        matriceCellules = new CelluleLumineuse[nbLignes][nbColonnes];
         for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                matriceCellules[i][j] = new CelluleLumineuse();
            }
        }
        
    }

    /**
     * comme eteindreCellule, mais sur chaque cellule de la matrice
     * inverse l'état allumé pour eteint, si cellule deja eteinte pas de changement
     */
    public void eteindreToutesLesCellules(){
        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                matriceCellules[i][j].eteindreCellule();
            }
        }
    }
    
    /**
     *cette fonction choisit au hasard entre 4 choix,
     * 1 activer (inverser l'état) toutes les cellules d'une ligne aléatoire
     * 2 activer toutes les cellules d'une colonne aléatoire
     * 3 activer toute les cellules de la diagonale descendante
     * 4 activer toutes les cellules de la diagonale montante
     */
    public void activerLigneColonneOuDiagonaleAleatoire(){
        Random random = new Random();
        int alea = random.nextInt(4);
        switch (alea) {
        case 0 -> {
            int ligneAleatoire = random.nextInt(nbLignes);
            for (int j = 0; j < nbColonnes; j++) {
                this.matriceCellules[ligneAleatoire][j].activerCellule(); // Appeler la méthode "activer" de la classe CelluleLumineuse
            }
            }

        case 1 -> {
            
            int colonneAleatoire = random.nextInt(nbColonnes);
            for (int i = 0; i < nbLignes; i++) {
                this.matriceCellules[i][colonneAleatoire].activerCellule();
            }
            }

        case 2 -> {
            
            for (int i = 0; i < Math.min(nbLignes, nbColonnes); i++) {
                this.matriceCellules[i][i].activerCellule(); 
            }
        }
        case 3 -> {
            for (int i = 0; i < nbLignes; i++) {
            matriceCellules[i][nbColonnes - i - 1].activerCellule();
        }
        }
    }
    }
    
    /**
     *cette fonction répète un nombre de fois demandé l'action active aléatoirement
     * ligne colone ou diagonale
     * @param nbTours
     */
    public void melangerMatriceAleatoirement(int nbTours){
        eteindreToutesLesCellules();
      for (int tour = 0; tour < nbTours; tour++) {
          activerLigneColonneOuDiagonaleAleatoire();
      }}
      
    /**
     *prend en paramètre un numéro de ligne et en active toute ses cellules (inverse leur etat)
     * @param idLigne
     */
    public void activerLigneDeCellules(int idLigne) {
        if (idLigne >= 0 && idLigne < nbLignes) {
            for (int colonne = 0; colonne < matriceCellules[idLigne].length; colonne++) {
                matriceCellules[idLigne][colonne].activerCellule(); // Supposons que "activer" est une méthode de la classe Cellule
            }
        } else {
            System.out.println("L'indice de ligne est invalide.");
        }
    }

    /**
     *prend en paramètre un numéro de colonne et en active toutes ses cellules (inverse l'etat)
     * @param idColonne
     */
    public void activerColonneDeCellules(int idColonne) {
        if (idColonne >= 0 && idColonne < nbColonnes) {
            for (int ligne = 0; ligne < nbLignes; ligne++) {
                matriceCellules[ligne][idColonne].activerCellule(); // Supposons que "activer" est une méthode de la classe Cellule
            }
        } else {
            System.out.println("L'indice de colonne est invalide.");
        }
    }

    /**
    *cette fonction inverse l'etat, active les cellules sur la diagonale descendante
    */
    public void activerDiagonaleDescendante(){
         for (int i = 0; i < nbLignes; i++) {
            matriceCellules[i][i].activerCellule(); // Activer la cellule de la diagonale descendante
        }
    }

    /**
     *cette fonction inverse l'etat, active les cellules sur la diagonale montante
     */
    public void activerDiagonaleMontante(){
         for (int i = 0; i < nbLignes; i++) {
            matriceCellules[i][nbColonnes - i - 1].activerCellule(); // Activer la cellule de la diagonale montante
        }
    }

    /**
     *fonction qui indique si toutes les cellules d'une matrice sont eteintes
     * renvoie true si elles sont eteintes
     * renvoie false si elles ne sont pas toutes eteintes
     */
    public void cellulesToutesEteintes() {
        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                matriceCellules[i][j].estEteint();
                
            }
    }
    }

    @Override
    public String toString() {
        String chaine = "";
                chaine +="  |";
        for (int j = 0; j < nbColonnes; j++) {
            chaine += " " + j + " |";
        }
        chaine += "\n";

        // Ligne de séparation
        String q = new String(new char[nbColonnes * 4 + 3]).replace('\0', '-');
        chaine += q;
        chaine+="\n";

        // Affichage de la grille avec les indices de lignes
        for (int i = 0; i < nbLignes; i++) {
            chaine += i + " |";
            for (int j = 0; j < nbColonnes; j++) {
                    chaine +=" "+ matriceCellules[i][j].toString()+ " |";
                    
                
            }
            chaine += "\n";

            // Ligne de séparation
            String q2 = (new String(new char[nbColonnes * 4 + 3]).replace('\0', '-'));
            chaine += q2;
            chaine += "\n";
            
        }
        System.out.println(chaine);
        return null;
        
    }


    
}
    

