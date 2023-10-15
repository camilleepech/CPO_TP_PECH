/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp2_relation_1_pech;

/**
 *
 * @author Camille
 */
public class Voiture {
    String modele;
    String marque;
    int nbPlaces;
    Personne proprietaire;

    public Voiture(String modele, String marque, int nbPlaces) {
        this.modele = modele;
        this.marque = marque;
        this.nbPlaces = nbPlaces;
        this.proprietaire = null;
    }

    @Override
    public String toString() {
        return "Voiture " + modele + " de marque " + marque + " avec " + nbPlaces + " places.";
    }

}
