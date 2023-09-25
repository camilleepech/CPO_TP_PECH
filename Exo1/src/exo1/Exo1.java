/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exo1;

import java.io.InputStream;

/**
 *
 * @author Camille
 */
public class Exo1 {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String prenom;
        Scanner sc;
        sc = new Scanner(System.in);
        System.out.print("Bonjour, comment vous vous appelez ?");   
        prenom = sc.nextLine();
        
        int maVariable = 0;
       
        
        System.out.println("au revoir"+ prenom + maVariable);

    }

    private static class Scanner {

        public Scanner(InputStream in) {
        }

        private String nextLine() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }
    
}
