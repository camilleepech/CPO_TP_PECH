/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_pech;

/**
 *
 * @author Camille
 */
public class TP2_Bieres_PECH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des trolls", 7.0,"Dubuisson") ;
    uneBiere.lireEtiquette();
    BouteilleBiere autreBiere = new BouteilleBiere("Leffe", 6.6,"Abbaye de Leffe") ;
    autreBiere.lireEtiquette();
    BouteilleBiere Biere1 = new BouteilleBiere ("1668",4.3,"Montpellier");
    Biere1.lireEtiquette();
    BouteilleBiere Biere2 = new BouteilleBiere ("Chouffe Cherry",8.1,"Raphael");
    Biere2.lireEtiquette();
    BouteilleBiere Biere3 = new BouteilleBiere ("1668",7.0,"Camille");
    Biere3.lireEtiquette();
    System.out.println(Biere1.Décapsuler());
    System.out.println(uneBiere);
    autreBiere.Décapsuler();
    System.out.println(autreBiere);
    }
    
}
