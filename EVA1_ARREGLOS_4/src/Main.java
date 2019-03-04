/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pipol
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double adMatriz[][] = new double[5][5], adMatriz2[][] = new double[5][5], adResultados[][] = new double[5][5]; 
        
        for (int i = 0; i < adMatriz.length; i++) {
            for (int j = 0; j < adMatriz.length; j++) {
                adMatriz[i][j] = Math.random()*10+1;
                adMatriz2[i][j] = Math.random()*10+1;
                adResultados[i][j] = (adMatriz[i][j] * adMatriz2[i][j]);
            }
        }
        for (int i = 0; i < adMatriz.length; i++) {
            for (int j = 0; j < adMatriz.length; j++) {
                System.out.print("["+adMatriz[i][j]+"]");
            }
            System.out.println("");
        }
        System.out.println("");
        for (int i = 0; i < adMatriz.length; i++) {
            for (int j = 0; j < adMatriz.length; j++) {
                System.out.print("["+adMatriz2[i][j]+"]");
            }
            System.out.println("");
        }
        System.out.println("");
        for (int i = 0; i < adMatriz.length; i++) {
            for (int j = 0; j < adMatriz.length; j++) {
                System.out.print("["+adResultados[i][j]+"]");
            }
            System.out.println("");
        }
        
    }
    
}
