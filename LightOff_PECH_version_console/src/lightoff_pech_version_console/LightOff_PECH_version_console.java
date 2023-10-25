/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lightoff_pech_version_console;

/**
 *
 * @author Camille
 */
public class LightOff_PECH_version_console {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CelluleLumineuse c1 = new CelluleLumineuse(); 
        CelluleLumineuse c2 = new CelluleLumineuse();
        c1.activerCellule();
        System.out.println(c1);
        c2.eteindreCellule();
        System.out.println(c2.estEteint());
        c2.getEtat();
        System.out.println(c2);
                
    }
    
}
