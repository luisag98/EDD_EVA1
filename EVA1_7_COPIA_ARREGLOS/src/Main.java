/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Luisa María González Ordóñez 18550352
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int aiDatos[] = new int[100];
        
        for (int i = 0; i < aiDatos.length; i++) {
            aiDatos[i] = (int)(Math.random()*100+1);
        }
        
        System.out.println(aiDatos);
        
        for (int aiDato : aiDatos) {
            System.out.print(aiDato+" ");
        }
        
        // NECESITAMOS UN ARREGLO DE TAMAÑO 50
        /*aiDatos = new int[50];
        System.out.println("");
        for (int aiDato : aiDatos) {
            System.out.print(aiDato+" ");
        }*/
        
        int[] aiCopia = aiDatos;
        System.out.println("");
        System.out.println("aiDatos = " + aiDatos);
        System.out.println("aiCopia = " + aiCopia);
        for (int i : aiCopia) {
            System.out.print(i+" ");
        }
        
        aiDatos = new int[50];
        System.out.println("\nImprimiendo datos");
        for (int aiDato : aiDatos) {
            System.out.print(aiDato+" ");
        }
        System.out.println("\nImprimiendo copia");
        for (int i : aiCopia) {
            System.out.print(i+" ");
        }
        
    }
    
}
