/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

/**
 *
 * @author Camille
 */
public abstract class Personnage {
    String nom;
    int niveauVie;

    public Personnage(String nom, int niveauVie) {
        this.nom = nom;
        this.niveauVie = niveauVie;
    }

    @Override
    public String toString() {
        return "Personnage" + "nom=" + nom + ", niveauVie=" + niveauVie + '}';
    }
    
    
}
