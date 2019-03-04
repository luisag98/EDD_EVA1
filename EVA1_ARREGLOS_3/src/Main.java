/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Luisa María González Ordóñez
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int aiArreglo[][] = new int[5][5];
        int aiCopia[][] = new int[5][5];
        int x = 0, y = 0;
        
        for (int i = 0; i < aiArreglo.length; i++) {
            for (int j = 0; j < aiArreglo[i].length; j++) {
                aiArreglo[i][j] = (int)(Math.random()*100+1);
            }
        }
        for (int i = aiArreglo.length; i > 0; i--) {
            for (int j = aiArreglo.length; j > 0; j--) {
                aiCopia[x][y] = aiArreglo[i][j];
                x++;
            }
            y++;
        }
        
        for (int[] is : aiArreglo) {
            for (int i : is) {
                System.out.print("["+i+"]");
            }
            System.out.println("");
        }
        for (int[] is : aiCopia) {
            for (int i : is) {
                System.out.print("["+i+"]");
            }
            System.out.println("");
        }
    }
    
}
