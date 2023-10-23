/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

import Armes.Arme;
import java.util.ArrayList;

/**
 *
 * @author Camille
 */
public abstract class Personnage {
    String nom;
    int niveauVie;
    ArrayList<Arme> inventaire  = new ArrayList<Arme>();
    private Arme Arme_en_Main;
    
     public void Ajouter_Arme (Arme armedonnée){
        int taille3=inventaire.size();
        if (taille3 < 5){
        inventaire.add(armedonnée);
        }
     }    
    public Personnage(String nom, int niveauVie, Arme Arme_en_Main) {
        this.nom = nom;
        this.niveauVie = niveauVie;
        this.Arme_en_Main = null;
    }

    public Arme getArme_en_Main() {
        return Arme_en_Main;
    }
    public void équiper_arme (String nv_arme){
        for (int i=0 ; i<inventaire.size() ; i++){
            if (inventaire.get(1).equals(nv_arme)){
                Arme_en_Main=inventaire.get(i);
                System.out.println("L'arme à été trouvé et équipée");
            
        }
        
    
    
    
    }
    }
    @Override
    public String toString() {
        return "Personnage" + "nom=" + nom + ", niveauVie=" + niveauVie + "arme en main :" +Arme_en_Main;
    }
    
    
}
