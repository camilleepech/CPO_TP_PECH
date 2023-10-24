/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_heroic_fantasy_pech;

import Personnages.Personnage;
import Personnages.Magicien;
import Personnages.Guerrier;
import Armes.Epee;
import Armes.Baton;
import Armes.Arme;
import java.util.ArrayList;


/**
 *
 * @author Camille
 */
public class TP3_Heroic_Fantasy_PECH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Epee Excalibur = new Epee("Excalibur", 7, 5);
        Epee Durandal = new Epee("Durandal", 4, 7);
        Baton Chêne = new Baton("Chêne", 4, 5);
        Baton Charme = new Baton("Charme", 5, 6);
        ArrayList<Arme> liste = new ArrayList<Arme>();
        liste.add(Chêne);
        liste.add(Charme);
        liste.add(Durandal);
        liste.add(Excalibur);
        int taille = liste.size();
        for (int i = 0; i < taille; i++) {
            System.out.println(liste.get(i));
        }
        Magicien Gandalf = new Magicien("Gandalf", 65, true);
        Magicien Garcimore = new Magicien("Garcimore", 44, false);
        Guerrier Conan = new Guerrier ("Conan",78,false);
        Guerrier Lannister = new Guerrier ("Lannister",45,true);
        ArrayList<Personnage> liste2 = new ArrayList<Personnage>();
        liste2.add(Conan);
        liste2.add(Garcimore);
        liste2.add(Lannister);
        liste2.add(Gandalf);
        int taille2 = liste2.size();
        for (int i = 0; i < taille; i++) {
            System.out.println(liste2.get(i));
        }
        Guerrier Raphou = new Guerrier ("Raphou",19,true);
        Magicien Audric = new Magicien ("Audric",20,true);
        Baton Bleu = new Baton ("Bleu",15,2);
        Baton Rouge = new Baton ("Rouge",12,10);
        Baton Jaune = new Baton ("Jaune",5,20);
        Epee Rose= new Epee("Rose", 45,3);
        Epee Violet = new Epee("Violet", 21, 4);
        Epee Orange = new Epee("Orange", 14, 8);
        Raphou.Ajouter_Arme(Rose);
        Raphou.Ajouter_Arme(Violet);
        Raphou.Ajouter_Arme(Jaune);
        Audric.Ajouter_Arme(Bleu);
        Audric.Ajouter_Arme(Rouge);
        Audric.Ajouter_Arme(Orange);
        Raphou.équiper_arme(Rose);
        System.out.println(Audric);
        System.out.println(Raphou);
    }

}
