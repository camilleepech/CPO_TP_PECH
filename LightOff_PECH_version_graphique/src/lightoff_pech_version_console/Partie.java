/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_pech_version_console;
import java.util.Scanner;
/**
 *
 * @author Camille
 */
public class Partie {
    private GrilleDeCellules grille;
    private int nbCoups;

    /**
     *créé une nouvelle grille et initialise le compteur de coups a zéro.
     * 
     */
    public Partie() {
      this.nbCoups = 0;
    }
    
    /**
     *mélange la nouvelle grille, vérifie qu'elle est mélangée ( toutes les cellules
     * ne sont pas eteintes), sinon la mélange tant qu'elle ne l'est pas
     */
    public void initialiserPartie(int nbLignes, int nbColonnes) {
        grille = new GrilleDeCellules(nbLignes,nbColonnes);
        grille.melangerMatriceAleatoirement(100);
        while (grille.cellulesToutesEteintes()==true){
            grille.melangerMatriceAleatoirement(100);
        }
    }
    
    
        
    
    /**
     *la fonction démarre une partie avec une grille mélangée, et propose au joueur de
     * choisir le type de mouvement à activer, tant que les cellules ne sont pas toutes
     * éteintes. A chaque tour, la fonction indique combien de coups a joué le joueur
     */
    public void lancerPartie(){
        Scanner scanner = new Scanner(System.in);
        Scanner scan = new Scanner (System.in);
        Scanner scanx = new Scanner (System.in);
        Scanner scany = new Scanner (System.in);
        System.out.println("Bienvenue dans le jeu LightOff! /n Eteignez toutes les cases en actvant une"
                + "ligne, une colonne ou une diagonale /n Vous aurez le droit à un joker qui activera la case de votre choix");
        int joker = 1;
        System.out.println("1 - Niveau facile");
        System.out.println("2 - Niveau moyen");
        System.out.println("3 - Niveau difficile");
        System.out.print("Entrez le numéro du niveau : ");
        int niveau = scanner.nextInt();
        System.out.println("Challenge LightOff en 15 coups ?(oui/non)");
        String coupsMax = scan.nextLine();

        switch (niveau){
            case 1 -> {
                initialiserPartie(4,4);
            }
            case 2 -> {
                initialiserPartie(6,6);
            }
            case 3 -> {
                initialiserPartie(12,12);
            }
        }
        grille.toString(); 
        while ((("oui".equals(coupsMax) && nbCoups<15  ) || ("non".equals(coupsMax))) && (grille.cellulesToutesEteintes()!=true )  ){
            //while (grille.cellulesToutesEteintes()!=true) {
                System.out.println("Choisissez l'action :");
                System.out.println("1 - Activer une ligne");
                System.out.println("2 - Activer une colonne");
                System.out.println("3 - Activer la diagonale montante");
                System.out.println("4 - Activer la diagonale descendante");
                System.out.println("5 - Activer le joker");
                System.out.print("Entrez le numéro de l'action : ");
                int action = scanner.nextInt();
                switch (action) {
                    case 1 -> {
                        System.out.print("Entrez le numéro de la ligne à activer : ");
                        int ligneChoisie = scanner.nextInt();
                        grille.activerLigneDeCellules(ligneChoisie);
                           }
                    case 2 -> {
                        System.out.print("Entrez le numéro de la colonne à activer : ");
                        int colonneChoisie = scanner.nextInt();
                        grille.activerColonneDeCellules(colonneChoisie);
                           }
                    case 3 -> grille.activerDiagonaleMontante();
                    case 4 -> grille.activerDiagonaleDescendante();
                    case 5 ->{ if (joker == 1){
                        System.out.println("Choissez une ligne");
                        int x = scanx.nextInt();
                        System.out.println("choississez une colonne");
                        int y = scany.nextInt();
                        grille.matriceCellules[x][y].activerCellule();
                        
                    }}
                    default -> System.out.println("Choix invalide. Veuillez choisir une option valide.");
                }

            nbCoups++;
            System.out.println("Nombre de coups : " + nbCoups);
            grille.toString();
        }
        if (grille.cellulesToutesEteintes()){
            System.out.println("Félicitations ! Vous avez éteint toutes les cellules en " + nbCoups + " coups.");
        }
        else{
            System.out.println("Perdu ! Vous avez atteint les 15 coups, la prochaine fois...");
        }
}
}
