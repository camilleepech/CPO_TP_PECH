/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tp2_relation_1_pech;

/**
 *
 * @author Camille
 */
public class TP2_relation_1_PECH {

    public static void main(String[] args) {
        Voiture uneClio = new Voiture("Clio", "Renault", 5);
        Voiture uneAutreClio = new Voiture("Clio", "Renault", 5);
        Voiture une2008 = new Voiture("2008", "Peugeot", 6);
        Voiture uneMicra = new Voiture("Micra", "Nissan", 4);

        Personne bob = new Personne("Bobby", "Sixkiller");
        Personne reno = new Personne("Reno", "Raines");

        bob.ajouterVoiture(uneClio);
        bob.ajouterVoiture(une2008);
        reno.ajouterVoiture(uneMicra);
        reno.ajouterVoiture(uneAutreClio);

        System.out.println(bob + " possède les voitures suivantes:");
        for (int i = 0; i < bob.nbVoitures; i++) {
            System.out.println(bob.liste_voitures[i]);
        }

        System.out.println();

        System.out.println(reno + " possède les voitures suivantes:");
        for (int i = 0; i < reno.nbVoitures; i++) {
        System.out.println(reno.liste_voitures[i]);
        }
    }

}
