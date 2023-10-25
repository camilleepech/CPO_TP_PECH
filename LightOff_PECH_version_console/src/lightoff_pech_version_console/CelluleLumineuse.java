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

    public CelluleLumineuse() {
        
        this.etat = false;
    }
    
    public void activerCellule(){
        if (this.etat == false) {
            this.etat = true;
        }
        else if (this.etat == true){
            this.etat = false;
        }
    }
    
    public void eteindreCellule(){
        this.etat = false;
    }
        
    public boolean estEteint(){
        if (this.etat == false) {
            return true;
        } else {
            return false;
        }
    }

    public boolean getEtat() {
        return etat;
    }

    @Override
    public String toString() {
        if (etat== true){
            return "X";
        } else if (etat == false){
        
        return "O";
        }
        return null;
    }
}
