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
        int[] aiDatos; // referencia --> 1 byte
        aiDatos = new int[100]; // int --> 4 bytes = 400 bytes
        
        for (int i = 0; i < aiDatos.length; i++) {
            aiDatos[i] = (int)(Math.random()*100);
        }
        
        for (int aiDato : aiDatos) {
            System.out.print("[" + aiDato + "]");
        }
    }
    
}
