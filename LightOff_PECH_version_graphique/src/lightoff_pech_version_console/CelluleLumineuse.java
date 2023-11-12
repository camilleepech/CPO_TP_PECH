/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_pech_version_console;

/**
 *
 * @author Camille
 */
public class CelluleLumineuse {
    private boolean etat;

    /**
     * constructeur de cellule lumineuse
     * chaque nouvelle cellule est �teinte
     */
    public CelluleLumineuse() {
        
        this.etat = false;
    }
    
    /**
     *fonction qui "active" une cellule, soit inverse son �tat actuel
     * passe de "true" (allum�e) � "false" (�teinte) et vice-versa
     */
    public void activerCellule(){
        if (this.etat == false) {
            this.etat = true;
        }
        else if (this.etat == true){
            this.etat = false;
        }
    }
    
    /**
     *fonction qui �teint une cellule (etat false),
     * si elle est d�j� �teinte, l'�tat reste false
     */
    public void eteindreCellule(){
        this.etat = false;
    }
        
    /**
     *fonction qui nous indique si une cellule est �teinte
     * @return true si la cellule est �teinte (etat false)
     * false si la cellule n'est pas �teinte (etat true)
     */
    public boolean estEteint(){
        if (this.etat == false) {
            return true;
        } else {
            return false;
        }
    }

    /**
     *fonction qui indique l'�tat d'une cellule
     * @return true ou false si cellule allum�e ou �teinte
     */
    public boolean getEtat() {
        return etat;
    }

    /**
     *fonction qui repr�sente visuellement l'�tat d'une cellule
     * @return la lettre X (allum�e) ou O (�teinte) 
     */
    @Override
    public String toString() {
        if (etat== true){
            return "X";
        } else if (etat == false){
        
        return "0";
        }
        return null;
    }
}
