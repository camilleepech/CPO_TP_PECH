/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exo3;

import java.util.Scanner;

/**
 *
 * @author Camille
 */
public class Exo3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                Scanner scanner = new Scanner(System.in);
        double operande1, operande2, resultat;
        int operateur;
        
        System.out.println("1) add\n 2) substract\n 3) multiply\n 4) divide\n 5) modulo\n Entrez le numéro de l'operation souhaitee :");
        operateur = scanner.nextInt();
 if (operateur < 1 || operateur > 5) {
            System.out.println("Operation invalide.");
            System.exit(1); // Quitte le programme avec un code d'erreur
        }

        System.out.print("Entrez la premiere valeur : ");
        operande1 = scanner.nextDouble();

        System.out.print("Entrez la deuxieme valeur : ");
        operande2 = scanner.nextDouble();

        switch (operateur) {
            case 1 -> {
                resultat = operande1 + operande2;
                System.out.println("Le resultat de l'addition est : " + resultat);
            }
            case 2 -> {
                resultat = operande1 - operande2;
                System.out.println("Le resultat de la soustraction est : " + resultat);
            }
            case 3 -> {
                resultat = operande1 * operande2;
                System.out.println("Le resultat de la multiplication est : " + resultat);
            }
            case 4 -> {
                if (operande2 != 0) {
                    resultat = operande1 / operande2;
                    System.out.println("Le résultat de la division est : " + resultat);
                } else {
                    System.out.println("Division par zéro impossible.");
                }
            }
            case 5 -> {
                if (operande2 != 0) {
                    resultat = operande1 % operande2;
                    System.out.println("Le resultat du modulo est : " + resultat);
                } else {
                    System.out.println("Modulo par zero impossible.");
                }
            }
            default -> System.out.println("Operation invalide.");
        }
    }
}   