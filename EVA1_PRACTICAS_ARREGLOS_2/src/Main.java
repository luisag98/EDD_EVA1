/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author invitado
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] aiArreglo = new int[100][100];
        int j = 0;
        
        for (int i = 0; i < 100; i++) {
            aiArreglo[i][j] = 1;
            j++;
        }
        
        for (int i = 0; i < 100; i++) {
            for (int k = 0; k < 100; k++) {
                System.out.print(aiArreglo[i][k]);
            }
            System.out.println("");
        }
        
    }
    
}
