/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author temporal2
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] aiArreglo = new int[100];
        llenar(aiArreglo);
        imprimir(aiArreglo);
        int iValor = 10;
        System.out.println("\niValor = "+iValor);
        incrementa(iValor);
        System.out.println("iValor = "+iValor);
    }
    
    public static void llenar(int[] aiArre){
        for (int i = 0; i < aiArre.length; i++) {
            aiArre[i] = (int)(Math.random()*100+1);
        }
    }
    
    public static void imprimir(int[] aiArre){
        for (int i : aiArre) {
            System.out.print("["+i+"]");
        }
    }
    
    public static void incrementa(int i){
        i++;
    }
}

/*

paso por valor --> se manda una copia del valor
paso por referencia --> se manda una direccion de memoria

JAVA SOLO UTILIZA PASO POR VALOR PARA MODIFICAR VALORES
*/
