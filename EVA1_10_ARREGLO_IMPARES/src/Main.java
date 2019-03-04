/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author moviles
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int[] aiArreglo = new int[100];
        int[] aiCopia = aiArreglo;
        int x=0, y=0;
        
        for (int i = 0; i < aiArreglo.length; i++) {
            aiArreglo[i] = (int)(Math.random()*100+1);
        }
        
        for (int b : aiArreglo) {
            System.out.print(b+" ");
        }
        System.out.println("");
        for (int i = 0; i < aiArreglo.length; i++) {
            if (aiArreglo[i] % 2 != 0) {
                x++;
            }
        }
        System.out.println(x);
        aiArreglo = new int[x];
        for (int i = 0; i < aiCopia.length; i++) {
            do {                
                aiArreglo[y] = aiCopia[i];
                y++;
            } while (aiCopia[i] % 2 != 0);
        }
        for (int b : aiArreglo) {
            System.out.print(b+" ");
        } 
    }
    
}

public static void llenar(s)