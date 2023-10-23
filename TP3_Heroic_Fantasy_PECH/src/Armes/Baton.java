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
public class Baton extends Arme {
    int age;
    public Baton(String nom, int niveauAttaque, int age) {
        super(nom, niveauAttaque);
        if (age > 100) {
            this.age = 100;
        } else {
            this.age = age;
    }
    
}
       @Override
    public String toString() {
        return "Arme : " + nom + ", Niveau d'attaque : " + niveauAttaque + ", age : "
                + age ;
    }
}
