/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

/**
 *
 * @author Camille
 */
public class Magicien extends Personnage {
    private boolean confirme;
    public Magicien(String nom, int niveauVie, boolean confirme) {
        super(nom, niveauVie);
        this.confirme = confirme;
        nombreDeMagiciens++;
    }

    public void setConfirme(boolean confirme) {
        this.confirme = confirme;
    }

    @Override
    public String toString() {
        return "Personnage Magicien : " +nom +", points de vie :"+niveauVie +", confirmé :" + confirme+
                ", arme en main : "+ Arme_en_Main;
    }
        
}
