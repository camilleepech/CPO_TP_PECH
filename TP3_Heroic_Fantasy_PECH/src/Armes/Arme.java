/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

/**
 *
 * @author Camille
 */
public abstract class Arme {
     String nom;
    int niveauAttaque;


    public Arme(String nom, int niveauAttaque) {
        this.nom = nom;
        if (niveauAttaque > 100) {
            this.niveauAttaque = 100;
        } else {
            this.niveauAttaque = niveauAttaque;
        }
        
}
    @Override
    public String toString() {
        return "Arme : " + nom + ", Niveau d'attaque : " + niveauAttaque;
    }
}