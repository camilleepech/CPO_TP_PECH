/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

import Armes.Arme;

/**
 *
 * @author Camille
 */
public class Epee extends Arme{
    int indiceFinesse;

    public Epee(String nom, int niveauAttaque,int indiceFinesse) {
        super(nom, niveauAttaque);
            if (indiceFinesse > 100) {
            this.indiceFinesse = 100;
        } else {
            this.indiceFinesse = indiceFinesse;
        }
           
     
}
       @Override
    public String toString() {
        return "Arme : " + nom + ", Niveau d'attaque : " + niveauAttaque + ",indice finesse: "
         + indiceFinesse;
    }
}
