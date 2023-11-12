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
     * chaque nouvelle cellule est éteinte
     */
    public CelluleLumineuse() {
        
        this.etat = false;
    }
    
    /**
     *fonction qui "active" une cellule, soit inverse son état actuel
     * passe de "true" (allumée) à "false" (éteinte) et vice-versa
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
     *fonction qui éteint une cellule (etat false),
     * si elle est déjà éteinte, l'état reste false
     */
    public void eteindreCellule(){
        this.etat = false;
    }
        
    /**
     *fonction qui nous indique si une cellule est éteinte
     * @return true si la cellule est éteinte (etat false)
     * false si la cellule n'est pas éteinte (etat true)
     */
    public boolean estEteint(){
        if (this.etat == false) {
            return true;
        } else {
            return false;
        }
    }

    /**
     *fonction qui indique l'état d'une cellule
     * @return true ou false si cellule allumée ou éteinte
     */
    public boolean getEtat() {
        return etat;
    }

    /**
     *fonction qui représente visuellement l'état d'une cellule
     * @return la lettre X (allumée) ou O (éteinte) 
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
