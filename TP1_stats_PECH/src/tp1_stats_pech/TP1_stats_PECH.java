/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_stats_pech;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Camille
 */
public class TP1_stats_PECH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        Random randomGenerator = new Random();

        int[] facesDuDe = new int[6];  // Tableau pour stocker le nombre d'occurrences de chaque face du dé

        System.out.print("Saisissez le nombre d'itérations (m) : ");
        int iterations = scanner.nextInt();

        // Initialisation du tableau
        for (int i = 0; i < 6; i++) {
            facesDuDe[i] = 0;
        }

        // Simuler les lancers de dés
        for (int i = 0; i < iterations; i++) {
            int resultatLancer = randomGenerator.nextInt(6);  // Tirage aléatoire entre 0 et 5
            facesDuDe[resultatLancer]++;  // Incrémenter la case correspondante
        }

        System.out.println("Résultats en pourcentage :");

        // Afficher les résultats en pourcentage
        for (int i = 0; i < 6; i++) {
            double pourcentage = (double) facesDuDe[i] / iterations * 100;
            System.out.printf(" %d : %.2f%%\n", i + 1, pourcentage);
        }
    }
}
