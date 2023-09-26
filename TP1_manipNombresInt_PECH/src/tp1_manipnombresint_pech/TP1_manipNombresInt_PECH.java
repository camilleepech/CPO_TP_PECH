/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_manipnombresint_pech;

import java.util.Scanner;

/**
 *
 * @author Camille
 */
public class TP1_manipNombresInt_PECH {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        // Demande à l'utilisateur de saisir deux entiers
        try ( // Création d'un objet Scanner pour lire l'entrée de l'utilisateur
                Scanner scanner = new Scanner(System.in)) {
            
            System.out.print("Entrez le premier entier : ");
            int premierEntier = scanner.nextInt();
            System.out.print("Entrez le deuxième entier : ");
            int deuxiemeEntier = scanner.nextInt();
            
            System.out.println("La somme des entiers est : " + (premierEntier + deuxiemeEntier));
            System.out.println("La différence des entiers est : " + (premierEntier - deuxiemeEntier));
            System.out.println("Le produit des entiers est : " + (premierEntier * deuxiemeEntier));
            // Affiche le quotient entier et le reste de la division euclidienne
            int quotient = premierEntier / deuxiemeEntier;
            int reste = premierEntier % deuxiemeEntier;
            System.out.println("Le quotient de la division est : " + quotient);
            System.out.println("Le reste de la division est : " + reste);
            // Fermeture du scanner
        }
    }
}

