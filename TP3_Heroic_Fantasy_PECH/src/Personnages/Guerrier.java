/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

/**
 *
 * @author Camille
 */
public class Guerrier extends Personnage {
    private boolean aCheval;
    public Guerrier(String nom, int niveauVie, boolean aCheval) {
        super(nom, niveauVie);
         this.aCheval = aCheval;
         nombreDeGuerriers++;
    }

    public void setaCheval(boolean aCheval) {
        this.aCheval = aCheval;
    }

    @Override
    public String toString() {
        return "Personnage Guerrier : " +nom +", points de vie :"+niveauVie +", aCheval:" + aCheval+
                ", arme en main : "+ Arme_en_Main;
    }


    
    
}
